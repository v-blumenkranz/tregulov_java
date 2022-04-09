package Lesson6;

public class OverLoad {

    void show(int a){
        System.out.println(a);
    }

    void show(String b){
        System.out.println(b);
    }

    void show(boolean c){
        System.out.println(c);
    }

    void show(long d){
        System.out.println(d);
    }
}

class OverLoadTest{
    public static void main(String []args) {
        OverLoad oL = new OverLoad();
        oL.show(17);
        oL.show("Hello");
        oL.show(true);
    }
}
