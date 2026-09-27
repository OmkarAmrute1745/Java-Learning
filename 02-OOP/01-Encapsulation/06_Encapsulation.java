/*
 * JAVA OOP
 * AREA: Encapsulation
 * CONCEPT: Encapsulation
 *
 * What is it?
 * Encapsulation is an important Object-Oriented Programming concept in Java.
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
class BankAccount{private double balance;BankAccount(double b){if(b>=0)balance=b;}void deposit(double a){if(a>0)balance+=a;}boolean withdraw(double a){if(a>0&&a<=balance){balance-=a;return true;}return false;}double getBalance(){return balance;}} class Concept06_Encapsulation{public static void main(String[]args){BankAccount a=new BankAccount(1000);a.deposit(500);System.out.println(a.withdraw(300));System.out.println(a.getBalance());}}
