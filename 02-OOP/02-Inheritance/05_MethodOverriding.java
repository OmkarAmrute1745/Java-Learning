/*
 * JAVA OOP
 * AREA: Inheritance
 * CONCEPT: Method Overriding
 *
 * What is it?
 * Method Overriding is an important Object-Oriented Programming concept in Java.
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
class Payment{void pay(){System.out.println("Generic");}}class UpiPayment extends Payment{@Override void pay(){System.out.println("UPI");}} class Concept05_MethodOverriding{public static void main(String[]args){Payment p=new UpiPayment();p.pay();}}
