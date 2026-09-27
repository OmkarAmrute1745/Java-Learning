/*
 * JAVA OOP
 * AREA: Inheritance
 * CONCEPT: super Keyword
 *
 * What is it?
 * super Keyword is an important Object-Oriented Programming concept in Java.
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
class Employee{protected String name;Employee(String n){name=n;}void show(){System.out.println(name);}}class Manager extends Employee{Manager(String n){super(n);}void managerShow(){super.show();}} class Concept04_SuperKeyword{public static void main(String[]args){new Manager("Omkar").managerShow();}}
