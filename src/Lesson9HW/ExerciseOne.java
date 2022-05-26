package Lesson9HW;

public class ExerciseOne {
    public static void abc(){
        String s1 = new String("ABC");
        String s2 = new String("DEF");
    }

}

class ExerciseOneTest{
    public static void main(String[] args) {
        ExerciseOne e1 = new ExerciseOne();
        ExerciseOne.abc();
        ExerciseOne.abc();
        String s1 = new String("ABC");
        ExerciseOne.abc();
    }
}
