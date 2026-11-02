package task5;

import java.util.*;

public class SafeDel {
    public static void main(String[] args) {
        List<Integer> broken = new ArrayList<>(List.of(1, 2, 3));
        try{
            for(Integer cur : broken){
                if(cur.equals(3))
                    broken.remove(cur);
            }
        } catch(ConcurrentModificationException e){
            System.out.println("Catch: " + e);
        }

        List<Integer> IteratorFixed = new ArrayList<>(List.of(1, 2, 3));
        Iterator<Integer> it = IteratorFixed.iterator();
        while (it.hasNext()) {
            if (it.next().equals(3))
                it.remove();
        }
        System.out.println("Iterator fix " + IteratorFixed);
        List<Integer> RemoveIfFixed = new ArrayList<>(List.of(1, 2, 3));
        RemoveIfFixed.removeIf(cur -> cur.equals(3));
        System.out.println("RemocveIF fix: " + RemoveIfFixed);
    }
}
