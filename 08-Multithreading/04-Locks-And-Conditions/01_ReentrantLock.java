/*
 * JAVA MULTITHREADING
 * AREA: Locks And Conditions
 * CONCEPT: ReentrantLock
 *
 * What is it?
 * ReentrantLock is an important Java concurrency concept.
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

class Concept01_ReentrantLock { public static void main(String[] args){var lock=new java.util.concurrent.locks.ReentrantLock();lock.lock();try{System.out.println("Critical section");}finally{lock.unlock();}}}\n