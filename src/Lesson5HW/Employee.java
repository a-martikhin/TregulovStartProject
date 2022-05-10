package Lesson5HW;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id1, String surname1, int age1, double salary1, String department1){
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

    void doubleSalary(){
        salary *= 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 40, 150.00, "Develop");
        Employee emp2 = new Employee(2, "Petrov", 35, 200.00, "PM");

        System.out.println("Зарплата сотрудника " + emp1.surname + " до повышения " + emp1.salary);
        emp1.doubleSalary();
        System.out.println("Зарплата сотрудника " + emp1.surname + " после повышения " + emp1.salary);

        System.out.println("Зарплата сотрудника " + emp2.surname + " до повышения " + emp2.salary);
        emp2.doubleSalary();
        System.out.println("Зарплата сотрудника " + emp2.surname + " после повышения " + emp2.salary);
    }
}