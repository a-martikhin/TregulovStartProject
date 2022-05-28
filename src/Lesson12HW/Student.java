package Lesson12HW;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}

class StudentTest{
    void sravnenieOneIf(Student st1, Student st2){
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade){
            System.out.println("Student " + st1.name + " i Student " + st2.name + " ravni");
        } else {
            System.out.println("Student " + st1.name + " i Student " + st2.name + " ne ravni");
        }
    }

    void sravnenieNestedIf(Student st1, Student st2){
        if(st1.name.equals(st2.name)){
            if(st1.course == st2.course){
                if(st1.grade == st2.grade){
                    System.out.println("Student " + st1.name + " i Student " + st2.name + " ravni");
                } else {
                    System.out.println("U studenta " + st1.name + " i studenta " + st2.name + " odinakovie imena i kursi, raznie ocenki");
                }
            } else {
                System.out.println("U studenta " + st1.name + " i studenta " + st2.name + " odinakovie imena, no raznie kursi");
            }
        } else {
            System.out.println("U studenta " + st1.name + " i studenta " + st2.name + " raznie imena");
        }
    }

    public static void main(String[] args) {
        StudentTest sTest = new StudentTest();
        Student st1 = new Student("Ivan", 3, 10.0);
        Student st2 = new Student("Ivan", 3, 10.0);
        Student st3 = new Student("Oleg", 2, 9.0);
        Student st4 = new Student("Ivan", 2, 10.0);
        Student st5 = new Student("Ivan", 3, 8.0);
        sTest.sravnenieOneIf(st1, st2);
        sTest.sravnenieOneIf(st1, st3);
        System.out.println();
        sTest.sravnenieNestedIf(st1, st2);
        sTest.sravnenieNestedIf(st1, st3);
        sTest.sravnenieNestedIf(st1, st4);
        sTest.sravnenieNestedIf(st1, st5);
    }
}
