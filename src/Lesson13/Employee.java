package Lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("ponedelnik"){
            case "ponedelnik":
            case "vtornik":
            case "sreda":
            case "chetverg":
            case "pyatnica":
                System.out.println("Rabotaem do 18-00");
                break;
            case "subbota":
                System.out.println("Rabotaem do 14-00");
                break;
            case "voskresenie":
                System.out.println("Raboti net");
                break;
            default:
                System.out.println("Takogo dnya ne sushestvuet");
        }
    }
}
