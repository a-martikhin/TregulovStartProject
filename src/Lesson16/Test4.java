package Lesson16;

import Lesson10HW.p4.p5.E;
import org.w3c.dom.ls.LSOutput;

public class Test4 {

}

class Employee{
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager){
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee{
    public static void main(String[] args) {
        Employee emp = new Employee(100.5, true);
        System.out.println("On manager? " + emp.isManager + " Ego zarplata: " + emp.salary);
    }
}
