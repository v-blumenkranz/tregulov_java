package Lesson5;

public class CatDefined {
    CatDefined(String name, int age, String color) {
        name1 = name;
        age1 = age;
        color1 = color;

        System.out.println("Имя: " + name1);
        System.out.println("Возраст: " + age1);
        System.out.println("Цвет: " + color1);
    }
    String name1;
    int age1;
    String color1;

}

class CatDefinedTest {
    public static void main(String []args) {
        CatDefined myCat = new CatDefined("Ириска", 3, "Рыжая");
        System.out.println();
        CatDefined neighboursCat = new CatDefined("Шекель", 2, "Черный");

    }
}