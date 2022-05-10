package Lesson6;

public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);
        System.out.println("Datatype is int!");
    }

    void show(boolean b1){
        System.out.println(b1);
        System.out.println("Datatype is boolean!");
    }

    void show(String s1){
        System.out.println(s1);
        System.out.println("Datatype is String!");
    }

    void show(String s, int b){
        System.out.println("String s: " + s + " Int b: " + b);
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);

        boolean b = true;
        mO.show(b);

        String s = "Privet!!!";
        mO.show(s);
        mO.show(s, 10);

    }
}
