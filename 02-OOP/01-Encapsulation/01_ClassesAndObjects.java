/*
 * JAVA OOP
 * AREA: Encapsulation
 * CONCEPT: Classes and Objects
 *
 * What is it?
 * Classes and Objects is an important Object-Oriented Programming concept in Java.
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
    String number;
    double balance;
    void deposit(double a) {
        balance+=a;
    }
}
class Concept01_ClassesAndObjects {
    public static void main(String[]args) {
        Account a=new Account();
        a.number="A101";
        a.balance=1000;
        a.deposit(500);
        System.out.println(a.number+" "+a.balance);
    }
}
