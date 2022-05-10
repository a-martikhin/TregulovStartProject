package Lesson7_1;

import Lesson7HW.Employee;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Poh", 50.0); //остальные конструкторы скрыты модификатором доступа
        emp1.showId();
        emp1.showSalary();
        emp1.showSurname();

        System.out.println(emp1.surname);
//        System.out.println(emp1.salary); //скрыто модификатором доступа
//        System.out.println(emp1.id); //скрыто модификатором доступа
    }
}
