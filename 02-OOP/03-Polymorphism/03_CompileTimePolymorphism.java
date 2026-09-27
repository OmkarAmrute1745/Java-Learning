/*
 * JAVA OOP
 * AREA: Polymorphism
 * CONCEPT: Compile-Time Polymorphism
 *
 * What is it?
 * Compile-Time Polymorphism is an important Object-Oriented Programming concept in Java.
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
class Printer{void print(int x){System.out.println("int");}void print(String x){System.out.println("String");}} class Concept03_CompileTimePolymorphism{public static void main(String[]args){Printer p=new Printer();p.print(10);p.print("Java");}}
