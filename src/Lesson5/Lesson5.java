package Lesson5;

class Test5 {

    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int avg (int a1, int b1, int c1) {
        int resultAvg = summa(a1, b1, c1)/3;
        return resultAvg;
    }
}

class Lesson5 {
    public static void main(String []args) {

        Test5 sumCall = new Test5();
        int justVariable = sumCall.summa(1,2,3);
        System.out.println(justVariable);
        System.out.println(sumCall.avg(10,10,10));
    }
}
