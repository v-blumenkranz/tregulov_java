package Lesson7;


public class EmployeeNew {

    private double salarySize;
    int idNumber;
    public String surnameSpelling;
    String departmentName;
    int ageCount;


    public EmployeeNew(int id, String surname, int age, double salary, String department) {

        salarySize = salary;
        idNumber = id;
        surnameSpelling = surname;
        departmentName = department;
        ageCount = age;

        System.out.println("ID:" + id);
        System.out.println("Фамилия:" + surname);
        System.out.println("Возраст:" + age);
        System.out.println("Зарплата:" + salary);
        System.out.println("Отдел:" + department);
    }

    private EmployeeNew(int id, String surname, int age){

        idNumber = id;
        surnameSpelling = surname;
        ageCount = age;
    }

    EmployeeNew(String surname, int age){

        surnameSpelling = surname;
        ageCount = age;
    }

    public double showSalarySize(){
        double result = salarySize;
        return result;
    }

    public String surnameSpelling(){
        String result = surnameSpelling;
        return result;
    }

    public int showIdNumber(){
        int result = idNumber;
        return result;
    }



}

class EmployeeNewTest {
    public static void main(String[] args) {

    }
}