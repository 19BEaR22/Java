package task9;

import java.util.*;

public class PECS {
    public static void main(String[] args) {
        List<Course> source = List.of(
            new Course("IS541", "Intro"),
            new Course("IV523", "Math")
        );
        List<Object> target = new ArrayList();

        copyInto(target, source);
        System.out.println("Target: " + target);
    }

    static void copyInto(List< ? super Course> target, List<? extends Course> source) {
        for(Course course : source)
            target.add(course);
    }
}
