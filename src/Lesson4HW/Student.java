package Lesson4HW;

public class Student {
    int id;
    String name;
    String surname;
    int course;
    double mathGrade;
    double econGrade;
    double langGrade;

    void studentInfo(){
        System.out.println("Студент " + course + " курса "
                + name + " " + surname + " c номером билета " + id + ", имеет среднюю оценку: " +
                (mathGrade + econGrade + langGrade)/3);
    }
}

class StudentTest{

    void studentInfo2(Student st1){
        System.out.println("Студент " + st1.course + " курса "
                + st1.name + " " + st1.surname + " c номером билета " + st1.id + ", имеет среднюю оценку: " +
                (st1.mathGrade + st1.econGrade + st1.langGrade)/3);
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.id = 1;
        st1.name = "Ivan";
        st1.surname = "Poddubniy";
        st1.course = 2;
        st1.mathGrade = 3.5;
        st1.econGrade = 5.0;
        st1.langGrade = 4.1;

        Student st2 = new Student();
        st2.id = 2;
        st2.name = "Elena";
        st2.surname = "Khan";
        st2.course = 1;
        st2.mathGrade = 3.8;
        st2.econGrade = 4.3;
        st2.langGrade = 4.9;

        Student st3 = new Student();
        st3.id = 3;
        st3.name = "Vadim";
        st3.surname = "Zalupko";
        st3.course = 5;
        st3.mathGrade = 5.0;
        st3.econGrade = 3.3;
        st3.langGrade = 4.75;

        StudentTest s = new StudentTest();
        s.studentInfo2(st1);
        st1.studentInfo();
        s.studentInfo2(st2);
        st2.studentInfo();
        s.studentInfo2(st3);
        st3.studentInfo();

        }
    }