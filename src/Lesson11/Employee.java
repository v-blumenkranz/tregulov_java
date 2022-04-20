package Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double growTwice(double a){
        a = a * 2;
        return a;
    }

    public double growSalaryTwice(){
        salary = salary * 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[]args){
        Employee emp1 = new Employee("Иван", 100.55);
        double result = emp1.growTwice(emp1.salary);
        System.out.println(result);
        System.out.println(emp1.salary);
        double rightResult = emp1.growSalaryTwice();
        System.out.println(rightResult);
        System.out.println(emp1.salary);
    }
}