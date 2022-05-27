package Lesson11HW;

import Lesson10HW.p1.p2.p3.C;

public class Car {
    String color;
    String engine;
    int doorQty;

    Car(String color, String engine, int doorQty){
        this.color = color;
        this.engine = engine;
        this.doorQty = doorQty;
    }
}

class CarTest{
    void changeDoorQty(int delta, Car c1){
        c1.doorQty += delta;
    }

    void swapColor(Car c1, Car c2){
        String s = c1.color;
        c1.color = c2.color;
        c2.color = s;
    }

    public static void main(String[] args) {
        CarTest cT = new CarTest();
        Car c1 = new Car("Red","V6", 3);
        Car c2 = new Car("Black", "V3", 5);
        cT.changeDoorQty(2, c1);
        System.out.println(c1.doorQty);
        cT.swapColor(c1, c2);
        System.out.println(c1.color);
        System.out.println(c2.color);

    }
}
