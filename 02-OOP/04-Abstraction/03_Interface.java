/*
 * JAVA OOP
 * AREA: Abstraction
 * CONCEPT: Interface
 *
 * What is it?
 * Interface is an important Object-Oriented Programming concept in Java.
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

interface Payable {
    void pay(double amount);
}
class Invoice implements Payable {
    public void pay(double amount) {
        System.out.println("Paid "+amount);
    }
}
class Concept03_Interface {
    public static void main(String[]args) {
        Payable p=new Invoice();
        p.pay(2500);
    }
}
