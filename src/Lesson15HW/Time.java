package Lesson15HW;

import java.text.DecimalFormat;

public class Time {
    static void timer() {

        int chas = 0;
        OUTER:
        while (chas < 6) {
            int minuta = -1;

            INNER1:
            do {
                minuta++;
                if (chas > 1 && minuta % 10 == 0){
                    break OUTER;
                }
                int sekunda = 0;

                INNER0:
                while (sekunda < 60) {
                    if(sekunda * chas > minuta){
                        continue INNER1;
                    }
                    DecimalFormat d = new DecimalFormat("00");
                    System.out.println(d.format(chas) + ":" + d.format(minuta) + ":" + d.format(sekunda));
                    sekunda++;
                }
            } while (minuta < 59);
            chas++;
        }
    }
}


class TimeTest{
    public static void main(String[] args) {
            Time.timer();
    }
}

