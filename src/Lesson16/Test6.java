package Lesson16;

import java.util.Locale;

public class Test6 {
    public static void main(String[] args) {
        String s = "PrIvEt";

        String s2 = s.toLowerCase();

        System.out.println(s2);

        String s3 = s.toUpperCase();
        System.out.println(s3);

        boolean b = s.contains("Et");
        System.out.println(b);
    }
}
