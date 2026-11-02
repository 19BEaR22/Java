package task3;

import java.util.*;

public class MapCIDtoC {

    public static void main(String[] args) {
        Map<String, Course> index = new HashMap<>();

        Course first = new Course("IS541", "text");
        Course second = new Course("IS541", "duptext");

        Course previous = index.putIfAbsent(first.getId(), first);
        if(previous != null){
            System.out.println("Already exist: " + previous);
        }

        index.computeIfAbsent("IS541", id -> new Course(id, "Java"));
        index.putIfAbsent("IS541", second);

        System.out.println("containKey: " + index.containsKey("IS541"));
        System.out.println("get: " + index.get("IS541"));
        System.out.println("Index: " + index);
    }
}