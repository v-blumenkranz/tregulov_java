package Lesson4;

class Student {
    int id;
    String name;
    String familyName;
    int lastYear;
    double avgMath;
    double avgEconomics;
    double avgForeignLanguage;

    Student(int id1, String name1, String familyName1, int lastYear1, double avgMath1, double avgEconomics1, double avgForeignLanguage1) {
        id = id1;
        name = name1;
        familyName = familyName1;
        lastYear = lastYear1;
        avgMath = avgMath1;
        avgEconomics = avgEconomics1;
        avgForeignLanguage = avgForeignLanguage1;

        System.out.println("Номер студенческого билета: " + id);
        System.out.println("Имя: " + name1);
        System.out.println("Фамилия: " + familyName);
        System.out.println("Год выпуска: " + lastYear);
        System.out.println("Средняя оценка по математике: " + avgMath);
        System.out.println("Средняя оценка по экономике: " + avgEconomics);
        System.out.println("Средняя оценка по иностранному языку: " + avgForeignLanguage);
        System.out.println();

    }

    Student(int id1, String name1, String familyName1, int lastYear1){
        this(id1, name1, familyName1, lastYear1, 0.0, 0.0, 0.0);
    }

    Student(){
        this(0,null,null, 0, 0.0, 0.0, 0.0);
    }


    double showAvgGrade(Student x) {
        double avgGrade = (x.avgEconomics + x.avgMath + x.avgForeignLanguage)/3;
        return avgGrade;
    }

}

public class StudentTest{
    public static void main(String []args) {

        Student student1 = new Student(345, "Алексей", "Блюменкранц", 2013, 7.8, 3.3, 9.9);

        Student student2 = new Student(343, "Иван", "Александров", 2014);

        Student student3 = new Student();

        System.out.println("Средняя оценка студента " + student1.name + " " + student1.familyName + " " + "по всем предметам - " + student1.showAvgGrade(student1));
        System.out.println("Средняя оценка студента " + student2.name + " " + student2.familyName + " " + "по всем предметам - " + student2.showAvgGrade(student2));
        System.out.println("Средняя оценка студента " + student3.name + " " + student3.familyName + " " + "по всем предметам - " + student3.showAvgGrade(student3));


    }
}