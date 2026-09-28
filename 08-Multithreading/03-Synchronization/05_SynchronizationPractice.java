/*
 * JAVA MULTITHREADING
 * AREA: Synchronization
 * CONCEPT: synchronization practice
 *
 * What is it?
 * synchronization practice is an important Java concurrency concept.
 *
 * Why do we need it?
 * It helps applications execute work concurrently and safely manage shared resources.
 *
 * Key points:
 * - Understand the concept before memorizing syntax.
 * - Run the example and change the values.
 * - Think about thread safety and shared state.
 *
 * Interview note:
 * Be able to explain the concept in simple words and give one practical backend example.
 */

class Concept05_SynchronizationPractice { static class Account{private int balance=1000;synchronized void deposit(int n){balance+=n;}synchronized int balance(){return balance;}}public static void main(String[] args)throws Exception{Account a=new Account();Thread x=new Thread(()->a.deposit(500));Thread y=new Thread(()->a.deposit(300));x.start();y.start();x.join();y.join();System.out.println(a.balance());}}\n