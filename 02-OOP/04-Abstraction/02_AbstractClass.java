/*
 * JAVA OOP
 * AREA: Abstraction
 * CONCEPT: Abstract Class
 *
 * What is it?
 * Abstract Class is an important Object-Oriented Programming concept in Java.
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
abstract class Report{void header(){System.out.println("REPORT");}abstract void generate();}class SalesReport extends Report{@Override void generate(){System.out.println("Sales");}} class Concept02_AbstractClass{public static void main(String[]args){Report r=new SalesReport();r.header();r.generate();}}
