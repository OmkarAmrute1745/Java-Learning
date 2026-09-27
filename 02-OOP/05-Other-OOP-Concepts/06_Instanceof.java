/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: instanceof Operator
 *
 * What is it?
 * instanceof Operator is an important Object-Oriented Programming concept in Java.
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
class Payment{}class UpiPayment extends Payment{} class Concept06_Instanceof{public static void main(String[]args){Payment p=new UpiPayment();System.out.println(p instanceof Payment);System.out.println(p instanceof UpiPayment);}}
