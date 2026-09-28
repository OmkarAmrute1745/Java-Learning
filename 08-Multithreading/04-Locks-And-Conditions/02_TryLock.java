/*
 * JAVA MULTITHREADING
 * AREA: Locks And Conditions
 * CONCEPT: tryLock
 *
 * What is it?
 * tryLock is an important Java concurrency concept.
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

class Concept02_TryLock { public static void main(String[] args){var lock=new java.util.concurrent.locks.ReentrantLock();if(lock.tryLock()){try{System.out.println("Lock acquired");}finally{lock.unlock();}}else System.out.println("Unavailable");}}\n