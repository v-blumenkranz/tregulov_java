package Lesson5;

public class Employee {

    double salarySize;
    int idNumber;
    String surnameSpelling;
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

    double doubleSalarySize(){
        salarySize = salarySize*2;
        return salarySize;
    }
}

class EmployeeTest {
    public static void main(String []args) {
        Employee newEmployee = new Employee(245, "Алексей Блюменкранц", 30, 300000.00, "Спецназ");
        System.out.println("Повышенная зарплата:" + newEmployee.doubleSalarySize());
    }
}












