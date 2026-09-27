/**
 * Topic: GenericComparable
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Student implements Comparable<Student> {
    int marks;
    Student(int marks) { this.marks = marks; }
    public int compareTo(Student other) { return Integer.compare(marks, other.marks); }
}
class Concept02_GenericComparable {

    public static void main(String[] args) {
        Student first = new Student(80);
        Student second = new Student(90);
        System.out.println(first.compareTo(second));
    }
}
