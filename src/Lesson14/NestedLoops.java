package Lesson14;

public class NestedLoops {
    public static void main(String[]args){
        time();
    }

    static void time(){
        OUTER: for (int i = 0; i < 6; i++){
            MIDDLE: for (int j = 0; j <= 59; j++){
                if (i > 1 & j % 10 == 0){
                    break OUTER;
                }
                INNER: for (int k = 0; k <= 59; k++){
                if (k * i > j){
                    continue MIDDLE;
                }
                    System.out.println(i + ":" + j + ":" + k);
                }
            }
        }
    }
}
