package Lesson14;

public class Test6 {

    public void time(){
        for (int chas = 0; chas <= 23; chas++){
            for (int minuta = 0; minuta <= 59; minuta++){
                System.out.println(chas + ":" + minuta);
            }
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}
