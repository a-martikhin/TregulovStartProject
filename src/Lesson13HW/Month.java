package Lesson13HW;

public class Month {
    int numberOfMonth;
    Month(int numberOfMonth){
        this.numberOfMonth = numberOfMonth;
    }
}

class MonthTest{
    public static void main(String[] args) {
        Month month = new Month(10);

        switch(month.numberOfMonth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("V mesyace 31 den");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("V mesyace 30 dney");
                break;
            case 2:
                System.out.println("V mesyace 28 dney");
                break;
            default:
                System.out.println("Nepravilnyi vvod");
        }
    }
}
