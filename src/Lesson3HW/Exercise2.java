package Lesson3HW;

public class Exercise2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        System.out.println(a-- - --a + ++a + a++ + a); // 5 - 3 + 4 + 4 + 5 = 15
        System.out.println(++b - b++ + ++b - --b); // 9 - 9 + 10 - 9 = 1
    }

}
