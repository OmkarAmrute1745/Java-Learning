/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: Association
 *
 * What is it?
 * Association is an important Object-Oriented Programming concept in Java.
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
class Student{String name;Student(String n){name=n;}}class Teacher{void teach(Student s){System.out.println("Teaching "+s.name);}} class Concept02_Association{public static void main(String[]args){new Teacher().teach(new Student("Omkar"));}}
