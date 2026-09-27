/**
 * Topic: StudentManagement
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Student {
    int id;
    String name;
    Student(int id, String name) { this.id = id; this.name = name; }
}

class Concept01_StudentManagement {

    public static void main(String[] args) {
        Student[] students = {new Student(1, "Omkar"), new Student(2, "Rahul")};
        for (Student student : students) System.out.println(student.id + " " + student.name);
    }
}
