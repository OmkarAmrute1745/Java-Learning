/*
 * JAVA MULTITHREADING
 * AREA: Thread Basics
 * CONCEPT: Thread practice
 *
 * What is it?
 * Thread practice is an important Java concurrency concept.
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

class Concept05_ThreadPractice { public static void main(String[] args)throws Exception{Thread a=new Thread(()->System.out.println("Download"));Thread b=new Thread(()->System.out.println("Email"));a.start();b.start();a.join();b.join();}}\n