/*
 * JAVA MULTITHREADING
 * AREA: Thread Control
 * CONCEPT: join
 *
 * What is it?
 * join is an important Java concurrency concept.
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

class Concept02_Join { public static void main(String[] args)throws Exception{Thread t=new Thread(()->System.out.println("Worker done"));t.start();t.join();System.out.println("Main continues");}}\n