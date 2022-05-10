package Lesson7HW;

public class EmployeeTest1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(2,"Petrov");
        Employee emp2 = new Employee(1,"Kac", 21.00);

        emp1.showId();
        emp1.showSurname();
        emp1.showSalary();

        System.out.println(emp1.id);
        System.out.println(emp1.surname);

        emp2.showId();
        emp2.showSurname();
        emp2.showSalary();

        System.out.println(emp2.id);
        System.out.println(emp2.surname);

    }
}
