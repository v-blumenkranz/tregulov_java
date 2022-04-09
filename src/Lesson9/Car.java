package Lesson9;

public class Car {
    String color;
    String engine;
    static int count;


    /*
    Если мы хотим сохранить имя переменных в параметрах конструктора, мы можем использовать ключевое слово this,
    которое будет указывать на то, что мы говорим о переменной объекта.
    */

    Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor(){
        System.out.println("Цвет машины: " + color);
        changeColor("зеленый");
    }

    public void changeColor(String color){
        System.out.println("Цвет машины изменился.");
        int price = 5000;
        this.color = color;
        price += 1000;
    }
}


