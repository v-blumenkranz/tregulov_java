package Lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount1 bA;

    void info() {
        System.out.println("Имя: " + name);
        System.out.println("Цвет машины: " + car.color);
        System.out.println("Номер счета: " + bA.id);
    }
}

class HumanTest{
    public static void main(String []args) {
        Human h = new Human();
        h.name = "Блюменкранц";
        h.car = new Car3("Синий", "200 лошадиных сил");
        h.bA = new BankAccount1(132, 3544.45);
        h.info();
    }
}

class Car3{

    Car3(String c, String e){
        color = c;
        engine = e;
    }

    String color;
    String engine;
}

class BankAccount1{
    BankAccount1(int id2, double balance2){
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}