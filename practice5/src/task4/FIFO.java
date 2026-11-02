package task4;

import java.util.*;

public class FIFO {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("Alice");
        queue.add("Bob");

        System.out.println("Cheking head: ");
        System.out.println("peek: " + queue.peek());
        System.out.println("elemet: " + queue.element());

        System.out.println("\nExtraction head: ");
        System.out.println("poll: " + queue.poll());
        System.out.println("remove: " + queue.remove());

        System.out.println("\nEmpty head: ");
        System.out.println("poll empty: " + queue.poll());
    }
}
