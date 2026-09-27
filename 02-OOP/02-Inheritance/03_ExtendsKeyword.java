/*
 * JAVA OOP
 * AREA: Inheritance
 * CONCEPT: extends Keyword
 *
 * What is it?
 * extends Keyword is an important Object-Oriented Programming concept in Java.
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

class BankAccount {
    void deposit() {
        System.out.println("Deposit");
    }
}
class SavingsAccount extends BankAccount {
    void interest() {
        System.out.println("Interest");
    }
}
class Concept03_ExtendsKeyword {
    public static void main(String[]args) {
        SavingsAccount a=new SavingsAccount();
        a.deposit();
        a.interest();
    }
}
