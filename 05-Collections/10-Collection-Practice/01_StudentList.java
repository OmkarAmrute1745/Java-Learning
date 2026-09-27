/**
 * Topic: StudentList
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Student {
    String name;
    Student(String name) { this.name = name; }
    public String toString() { return name; }
}
class Concept01_StudentList {

    public static void main(String[] args) {
        java.util.List<Student> students = new java.util.ArrayList<>();
        students.add(new Student("Omkar"));
        students.add(new Student("Amit"));
        System.out.println(students);
    }
}
