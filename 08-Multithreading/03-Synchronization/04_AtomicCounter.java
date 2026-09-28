/*
 * JAVA MULTITHREADING
 * AREA: Synchronization
 * CONCEPT: AtomicInteger
 *
 * What is it?
 * AtomicInteger is an important Java concurrency concept.
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

class Concept04_AtomicCounter { public static void main(String[] args)throws Exception{var c=new java.util.concurrent.atomic.AtomicInteger();Thread a=new Thread(()->{for(int i=0;i<10000;i++)c.incrementAndGet();});Thread b=new Thread(()->{for(int i=0;i<10000;i++)c.incrementAndGet();});a.start();b.start();a.join();b.join();System.out.println(c.get());}}\n