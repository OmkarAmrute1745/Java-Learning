/*
 * JAVA MULTITHREADING
 * AREA: Thread Basics
 * CONCEPT: Runnable
 *
 * What is it?
 * Runnable is an important Java concurrency concept.
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

class Concept02_Runnable { public static void main(String[] args)throws Exception{Runnable task=()->System.out.println("Task running");Thread t=new Thread(task);t.start();t.join();}}\n