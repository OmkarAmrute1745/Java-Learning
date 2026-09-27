/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: Relationships Between Objects
 *
 * What is it?
 * Relationships Between Objects is an important Object-Oriented Programming concept in Java.
 *
 * Why do we need it?
 * It helps us understand how Java models objects, relationships, reusable behavior, and maintainable designs.
 *
 * Key points:
 * - Understand the concept before memorizing syntax.
 * - Run the example and change the values.
 * - Connect the example to a real-world object or relationship.
 *
 * Interview note:
 * Be able to explain this concept in simple words and give one practical example.
 */

class Student {
    String name;
    Student(String n) {
        name=n;
    }
}
class Course {
    void enroll(Student s) {
        System.out.println(s.name+" enrolled");
    }
}
class Concept12_ObjectRelationships {
    public static void main(String[]args) {
        new Course().enroll(new Student("Omkar"));
    }
}
