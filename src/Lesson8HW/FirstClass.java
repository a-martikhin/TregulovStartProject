package Lesson8HW;

public class FirstClass {

    static final double pi = 3.14;
    static double umnozhenieChisel(double a, double b, double c){
        return a * b * c;
    }

    static void delenieChisel(double a, double b){
        int c = (int)(a/b);
        System.out.println("Целое частное двух чисел это: " + c);
        System.out.println("Остаток от деления двух чисел это: " + a%b);
    }

    double vichSKruga(double r){
        double s = pi * r * r;
        return s;
    }

    static double dlinaOkr(double r){
        double dlOkr = 2 * pi * r;
        return dlOkr;
    }

    void printResult(double r){
        System.out.println("При радиусе круга равном " + r);
        System.out.println("Площадь круга равна: " + vichSKruga(r));
        System.out.println("Длина окружности круга равна: " + dlinaOkr(r));
    }
}

class FirstClassTest{
    public static void main(String[] args) {
        FirstClass.delenieChisel(10.0, 11.2);
        FirstClass.delenieChisel(3.0, 2.0);
        FirstClass.umnozhenieChisel(1,2,3);
        FirstClass.umnozhenieChisel(0.5,0.6, 0.9);
        FirstClass f1 = new FirstClass();
        System.out.println(f1.vichSKruga(3));
        System.out.println(FirstClass.dlinaOkr(3));
        f1.printResult(3.0);

    }

}
