package task1;

public class Main {
    public static void method1() {
        System.out.println("Metod 1");
        method12();
    }

    public static void method12() {
        System.out.println("Metod 12");
        method123();
    }   


    public static void method123() {
        System.out.println("Metod 123");
        method1234();
    }

    public static void method1234() {
        throw new RuntimeException("JUDJMENT!");
    }        

    public static void main(String[] args) {
    try {
        method1();
    } catch (RuntimeException ex) {
        System.out.println(ex.getMessage());
        System.out.println("ТЫ ОШИБСЯ!!");
    }
    }
}
