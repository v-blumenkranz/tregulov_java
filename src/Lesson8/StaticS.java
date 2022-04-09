package Lesson8;

public class StaticS {

    final static double p = 3.14;

    double roundSRadius(double radius){
        return p*radius*radius;
    }

    static double lengthRadius(double radius){
        return p*2*radius;
    }

    void showInfo(double radius){
        System.out.println("Радиус круга: " + radius);
        System.out.println("Длина окружности: " + lengthRadius(radius));
        System.out.println("Площадь круга: " + roundSRadius(radius));
    }
}

class StaticSTest {

    public static void main(String []args){

        StaticS sta = new StaticS();
        System.out.println("Длина окружности: " + StaticS.lengthRadius(23.2));
        System.out.println("Площадь круга: " + sta.roundSRadius(23.2));
        System.out.println();
        sta.showInfo(23.2);
    }
}
