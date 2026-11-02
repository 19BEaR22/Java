package task8;

import java.util.*;

public class maxToComparable {
    static <T extends Comparable<? super T>> T max(Collection<T> values){
        T best = null;
        for(T current : values){
            if(best == null || current.compareTo(best) > 0)
                best = current;
        }
        return best;
    }

    public static void main(String[] args){
        System.out.println(max(List.of(1, 5, 3)));
        System.out.println(max(List.of("a", "z", "m")));
    }
}
