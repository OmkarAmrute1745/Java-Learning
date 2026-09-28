/*
 * JAVA MULTITHREADING
 * AREA: Thread Basics
 * CONCEPT: Thread creation
 *
 * What is it?
 * Thread creation is an important Java concurrency concept.
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

class Concept01_ThreadCreation { public static void main(String[] args)throws Exception{Thread t=new Thread(()->System.out.println("Running: "+Thread.currentThread().getName()));t.start();t.join();}}\n