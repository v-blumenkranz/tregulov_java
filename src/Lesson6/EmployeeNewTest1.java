package Lesson6;

import Lesson7.EmployeeNew;

public class EmployeeNewTest1 {
    public static void main(String []args){

        Lesson7.EmployeeNew emp = new EmployeeNew(17, "Бонд", 43, 345000.0, "Спецназ");
        System.out.println(emp.showSalarySize());
        System.out.println(emp.showIdNumber());

    }
}
