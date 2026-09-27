/*
 * JAVA OOP
 * AREA: Polymorphism
 * CONCEPT: Method Overloading
 *
 * What is it?
 * Method Overloading is an important Object-Oriented Programming concept in Java.
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
class Calculator{int add(int a,int b){return a+b;}double add(double a,double b){return a+b;}} class Concept01_MethodOverloading{public static void main(String[]args){Calculator c=new Calculator();System.out.println(c.add(1,2));System.out.println(c.add(1.5,2.5));}}
