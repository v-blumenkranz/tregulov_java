package Lesson9;

public class HomeworkTest2 {
    int a = 1;
    static int b = 2;
    void abc(int a){
        System.out.print(b);
        System.out.print(a);
        System.out.print(this.a);
        System.out.print(HomeworkTest2.b);
    }

    public static void main(String[]args){
        HomeworkTest2 test = new HomeworkTest2();
        test.abc(4);
    }
}
