/**
 * Topic: Comparable
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Student implements Comparable<Student> {
    int marks;
    Student(int marks) { this.marks = marks; }
    public int compareTo(Student other) { return Integer.compare(this.marks, other.marks); }
}
class Concept01_Comparable {

    public static void main(String[] args) {
        java.util.List<Student> students = new java.util.ArrayList<>();
        students.add(new Student(80));
        students.add(new Student(60));
        java.util.Collections.sort(students);
        System.out.println(students.get(0).marks);
    }
}
