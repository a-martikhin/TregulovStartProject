package Lesson14HW;

import java.text.DecimalFormat;

public class Time {
    static void timer(){
        OUTER:
        for (int chas = 0; chas <= 6; chas++){
            INNER1:
            for (int minuta = 0; minuta <= 59; minuta++){
                if (chas > 1 && minuta % 10 == 0){
                    break OUTER;
                }
                INNER0:
                for (int sekunda = 0; sekunda <= 59; sekunda++){
                    if (sekunda * chas > minuta){
                        continue INNER1;
                    }
                    DecimalFormat df = new DecimalFormat("00");
                    System.out.println(df.format(chas) + ":" + df.format(minuta) + ":" + df.format(sekunda));
                }
            }
        }
    }
}

class TimeTest{
    public static void main(String[] args) {
        Time.timer();
    }
}
