package task1;
import java.util.*;

public class ListTask1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        list.add("Name1");
        list.add("Name2");
        list.add("Name3");
        list.add("Name1");
        System.out.println("Порядок: " + list);

        list.add(3, "Тумбочка");
        System.out.println("Порядок: " + list);

        list.remove("Name2");
        list.remove(3);
        System.out.println("Порядок: " + list);

        list.add("Name4");
        list.add("Тумбочка");
        list.add("Name1");
        list.add("Табуретка");
        Set<String> seen = new HashSet<>();
        Set<String> dup = new LinkedHashSet<>();
        for (String r : list) {
            if (!seen.add(r)) {
                dup.add(r);
            }
        }

        System.out.println("Список: " + list);
        System.out.println("Дубликаты: " + dup);
    
        int n = 100_000;
        List<Integer> arrayList = new ArrayList<>(n);
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long sumArr = 0, sumLink = 0;
        long time0 = System.nanoTime();
        for(int i = 0; i < arrayList.size(); i++)
            sumArr += arrayList.get(i);
        long time1 = System.nanoTime();
        for(int i = 0; i < linkedList.size(); i++)
            sumLink += linkedList.get(i);
        long time2 = System.nanoTime();
        System.out.println("Index:\nArrayList: " + (time1 - time0) + " ns");
        System.out.println("LinkedList: " + (time2 - time1) + " ns");

        long FEArr = 0, FELink = 0;
        time0 = System.nanoTime();
        for(int x : arrayList)
            FEArr += x;
        time1 = System.nanoTime();
        for(int x : linkedList)
            FELink += x;
        time2 = System.nanoTime();
        System.out.println("ForEach:\nArrayList: " + (time1 - time0) + " ns");
        System.out.println("LinkedList: " + (time2 - time1) + " ns");
    }
}