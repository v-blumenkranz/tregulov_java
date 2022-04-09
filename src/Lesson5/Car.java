package Lesson5;

public class Car {

    String colour;
    String engine;
    int speed;

    int gas(int a) {
        speed+=a;
        return speed;
    }

    int brakes(int b) {
        speed-=b;
        return speed;
    }

    void showInfo(){
        System.out.println("Цвет: " + colour);
        System.out.println("Двигатель: " + engine);
        System.out.println("Скорость: " + speed);

    }
}

class carTest {

    public static void main(String []args) {

        Car myCar = new Car();
        myCar.engine = "700 лошадиных сил";
        myCar.colour = "Белый";
        myCar.speed = 80;

        myCar.showInfo();
        myCar.gas(20);
        myCar.showInfo();
    }
}