package Lesson8;

public class Static {

    public static int product(int a, int b, int c) {
        return a*b*c;
    }

    static void divide(int a, int b) {
        System.out.println("Результат деления: " + a/b);
        System.out.println("Остаток деления: " + a%b);
    }
}

class StaticTest {
    public static void main(String []args) {
        Static stat = new Static();
        System.out.println(Static.product(2,3,4));
        Static.divide(5,2);
        System.out.println();
        System.out.println(Static.product(4,5,6));
        Static.divide(17,3);
    }
}