/*
 * JAVA OOP
 * AREA: Encapsulation
 * CONCEPT: Access Modifiers
 *
 * What is it?
 * Access Modifiers is an important Object-Oriented Programming concept in Java.
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

class Account {
    private double balance=1000;
    public void deposit(double a) {
        if(a>0)balance+=a;
    }
    public double getBalance() {
        return balance;
    }
}
class Concept04_AccessModifiers {
    public static void main(String[]args) {
        Account a=new Account();
        a.deposit(500);
        System.out.println(a.getBalance());
    }
}
