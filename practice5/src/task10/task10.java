package task10;

import java.util.*;

public class task10 {
    public static void main(String[] args) {
        Set<Course> set = new HashSet<>();
        Map<Course, String> map = new HashMap<>();
        Course c = new Course("IS541", "Intro");
        set.add(c);
        map.put(c, "data");

        c.setTitle("Intro v2");

        System.out.println("contains: " + set.contains(c));
        System.out.println("get: " + map.get(c));
    }
}
