package Lesson11;

public class Car {
    String color;
    String engine;
    int doors;

    Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }

}

class CarTest {

    public static void changeDoors(Car car, int expectedNumber){
        car.doors = expectedNumber;
    }

    public static void swapColors(Car car1, Car car2){
        Car car3 = new Car(null, null, 0);
        car3.color = car1.color;
        car1.color = car2.color;
        car2.color = car3.color;
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "V", 2);
        Car car2 = new Car("green", "Z", 4);
        changeDoors(car1, 3);
        System.out.println(car1.doors);
        swapColors(car1, car2);
        System.out.println(car1.color);

    }
}
