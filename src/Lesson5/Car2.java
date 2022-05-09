package Lesson5;

public class Car2 {
    String color;
    String engine;
    int speed;

    int speedUp (int skorost){
        return speed += skorost;
    }

    int speedDown(int skorost){
        return speed -= skorost;
    }

    void showInfo(){
        System.out.println("Машина цвет: " + color + ". C двигателем: " + engine
                + ". Едет со скоростью: " + speed + " км/ч.");

    }
}

class Car2Test{
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.engine = "V6";
        c1.speed = 60;

        c1.showInfo();
        c1.speedUp(20);
        c1.showInfo();
        c1.speedDown(80);
        c1.showInfo();
    }
}
