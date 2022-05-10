package Lesson7HW;

public class Employee {
    int id;
    public String surname;
    private double salary;

    public void showSalary(){
        System.out.println("Зарплата сотрудника равна: " + salary);
    }

    public void showSurname(){
        System.out.println("Фамилия сотрудника: " + surname);
    }

    public void showId(){
        System.out.println("ID сотрудника: " + id);
    }

    public Employee(int id1, String surname1, double salary1){
        id = id1;
        surname = surname1;
        salary = salary1;
    }

    Employee (int id1, String surname1){
        id = id1;
        surname = surname1;
    }

    private Employee (String surname1, double salary1){
        surname = surname1;
        salary = salary1;
    }
}