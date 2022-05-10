package Lesson5;

import org.w3c.dom.ls.LSOutput;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info(){
        System.out.println("Имя: " + name + ". Цвет машины: " + car.color
                + ". Баланс банковского счёта: " + bA.balance);
    }

}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red", "V8");
        h.bA = new BankAccount(18, 200.5);
        h.info();
    }
}

class Car3{
    String color;
    String engine;

    Car3(String c, String e) {
        color = c;
        engine = e;
    }
}

class BankAccount{
    int id;
    double balance;
    BankAccount(int id2, double balance2){
        id = id2;
        balance = balance2;
    }

    void popolnenieScheta(double plus){
        balance += plus;
    }

    void snyatieSoScheta(double minus){
        balance -= minus;
    }
}