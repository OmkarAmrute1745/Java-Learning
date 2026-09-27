/*
 * JAVA OOP
 * AREA: Encapsulation
 * CONCEPT: this Keyword
 *
 * What is it?
 * this Keyword is an important Object-Oriented Programming concept in Java.
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
class Employee{int id;String name;Employee(int i,String n){this.id=i;this.name=n;}void show(){System.out.println(this.id+" "+this.name);}} class Concept03_ThisKeyword{public static void main(String[]args){new Employee(101,"Omkar").show();}}
