package Lesson6;

public class Employee {

    private double salarySize;
    int idNumber;
    public String surnameSpelling;
    String departmentName;
    int ageCount;


    Employee(int id, String surname, int age, double salary, String department) {

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
    Employee(int id, String surname, int age){
        this(id, surname, age, 0.0, null);
    }

    Employee(String surname, int age){
        this(0, surname, age, 0.0, null);
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

class EmployeeTest {
    public static void main(String[] args) {
        Employee newEmployee = new Employee(7, "Джеймс Бонд", 43);

    }
}