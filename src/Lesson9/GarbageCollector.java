package Lesson9;

public class GarbageCollector {

}

class GarbageCollectorTest{
    public static void main (String[]args) {
        GarbageCollector st1 = new GarbageCollector(); //Объект создан.
        GarbageCollector st2 = new GarbageCollector(); //Объект создан.
        GarbageCollector st3; //Объект не создался. Переменная пуста.
        st3 = new GarbageCollector(); //Объект создан.
        st1 = null; //Объект готов к уничтожению. Удалит ли его Garbage Collector - неизвестно.
    }
}
