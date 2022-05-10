package Lesson6HW;

public class FirstExercise {
    int summ(int a, int b, int c, int d){
        int s = a + b + c + d;
        System.out.println(s);
        return s;
    }

    int summ(int a, int b, int c){
        int s = a + b + c;
        System.out.println(s);
        return s;
    }

    int summ(int a, int b){
        int s = a + b;
        System.out.println(s);
        return s;
    }

    int summ(int a){
        System.out.println(a);
        return a;
    }

    int summ(){
        int s = 0;
        System.out.println(s);
        return s;
    }
}

class FirstEcerciseTest{
    public static void main(String[] args) {
        FirstExercise fE = new FirstExercise();
        fE.summ();
        fE.summ(1);
        fE.summ(1,2);
        fE.summ(1,2,3);
        fE.summ(1,2,3,4);
    }
}
