/*
 * JAVA OOP
 * AREA: Abstraction
 * CONCEPT: Abstraction
 *
 * What is it?
 * Abstraction is an important Object-Oriented Programming concept in Java.
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
abstract class PaymentService{abstract void pay(double amount);void status(){System.out.println("Ready");}}class CardService extends PaymentService{@Override void pay(double amount){System.out.println("Card "+amount);}} class Concept01_Abstraction{public static void main(String[]args){PaymentService p=new CardService();p.status();p.pay(1500);}}
