package Lesson15;

import java.text.DecimalFormat;

public class Test10 {
    public static void main(String[] args) {
        OUTER:
        for (int chas = 0; chas < 24; chas++){
            DecimalFormat d = new DecimalFormat("00");
            int minuta = 0;
            INNER:
            while (minuta < 60){
                System.out.println(d.format(chas) + ":" + d.format(minuta));
                minuta++;
            }
        }
    }
}
