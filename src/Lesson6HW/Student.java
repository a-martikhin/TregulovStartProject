package Lesson6HW;

public class Student {
    int id;
    String name;
    String surname;
    int course;
    double mathGrade;
    double econGrade;
    double langGrade;

    Student(){
    }

    Student(int id1, String name1, String surname1, int course1, double mathGrade1, double econGrade1, double langGrade1){
        id = id1;
        name = name1;
        surname = surname1;
        course = course1;
        mathGrade = mathGrade1;
        econGrade = econGrade1;
        langGrade = langGrade1;
    }

    Student(int id1, String name1, String surname1, int course1){
        this(id1, name1, surname1, course1, 0.00, 0.00, 0.00);
    }


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
        Student st2 = new Student(2, "Elena", "Khan", 1, 3.8, 4.3, 4.9);
        Student st3 = new Student(3, "Vadim", "Zalupko", 5);

        StudentTest s = new StudentTest();
        s.studentInfo2(st1);
        st1.studentInfo();
        s.studentInfo2(st2);
        st2.studentInfo();
        s.studentInfo2(st3);
        st3.studentInfo();

    }
}