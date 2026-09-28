/*
 * JAVA MULTITHREADING
 * AREA: Synchronization
 * CONCEPT: race condition
 *
 * What is it?
 * race condition is an important Java concurrency concept.
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

class Concept01_RaceCondition { static int count; public static void main(String[] args)throws Exception{Thread a=new Thread(()->{for(int i=0;i<10000;i++)count++;});Thread b=new Thread(()->{for(int i=0;i<10000;i++)count++;});a.start();b.start();a.join();b.join();System.out.println(count);}}\n