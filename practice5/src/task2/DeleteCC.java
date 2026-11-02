package task2;
import java.util.*;

public class DeleteCC {
    public static void main(String[] args) {
        List<String> codes = new ArrayList<>(List.of("IS541", "IS542", "IV523", "IS541", "IV521", "IV523"));
        Set<String> uniq = new LinkedHashSet<>(codes);
        Set<String> test = new HashSet<>(codes);
        System.out.println("Unique code: " + uniq);
        System.out.println("HashSet: " + test);
    }
    
}