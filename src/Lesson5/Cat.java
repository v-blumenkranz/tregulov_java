package Lesson5;

public class Cat {
    Cat(String name, int age, String color) {
        nameOutput = name;
        ageOutput = age;
        colorOutput = color;
    }
    String nameOutput;
    int ageOutput;
    String colorOutput;
}

class CatTest {

    public static void main(String []args) {
        Cat cat1 = new Cat("Ириска", 3, "Рыжая");
        System.out.println("Имя: " + cat1.nameOutput);
        System.out.println("Возраст: " + cat1.ageOutput);
        System.out.println("Цвет: " + cat1.colorOutput);


    }
}
