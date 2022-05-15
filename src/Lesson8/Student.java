package Lesson8;

public class Student {
    String name;
    int course;
    static int count;

    public Student(String name1, int course1){
        count++;
        name = name1;
        course = course1;
        System.out.println("Student " + count + " sozdan!");
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 3);
        Student st3 = new Student("Marina", 4);

        System.out.println(Student.count);
    }
}