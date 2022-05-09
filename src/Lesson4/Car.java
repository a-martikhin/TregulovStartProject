package Lesson4;

public class Car {
    Car(String cvet, String motor){
        color = cvet;
        engine = motor;
        System.out.println("Цвет машины: " + color + " Двигатель машины: " + engine);
    }
    String color;
    String engine;
}

class CarTest{
    public static void main(String[] args) {
        Car car1 = new Car("yellow","v4");
        System.out.println(car1.color);
        System.out.println(car1.engine);

    }
}
