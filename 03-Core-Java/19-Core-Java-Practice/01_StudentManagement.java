/**
 * Topic: 01 StudentManagement
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class 01StudentManagement {

    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "Omkar"),
            new Student(2, "Rahul")
        };
        for (Student student : students) {
            System.out.println(student.id + " " + student.name);
        }
    }
}
