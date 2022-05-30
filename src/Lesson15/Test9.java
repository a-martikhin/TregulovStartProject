package Lesson15;

import java.text.DecimalFormat;

public class Test9 {
    public static void main(String[] args) {
        int chas = -1;

        OUTER:
        do {
            chas++;
            int minuta = 0;

            INNER:
            while(minuta < 60){
                if(minuta == 20){
                    break OUTER;
                }
                DecimalFormat d = new DecimalFormat("00");
                System.out.println(d.format(chas) + ":" + d.format(minuta));
                minuta++;
            }
        } while (chas < 24);
    }
}
