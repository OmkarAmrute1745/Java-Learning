/*
 * JAVA MULTITHREADING
 * AREA: Concurrency Practice
 * CONCEPT: thread-safe counter
 *
 * What is it?
 * thread-safe counter is an important Java concurrency concept.
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

class Concept02_ThreadSafeCounter { static final var count=new java.util.concurrent.atomic.AtomicInteger();public static void main(String[] args)throws Exception{Thread a=new Thread(()->{for(int i=0;i<1000;i++)count.incrementAndGet();});Thread b=new Thread(()->{for(int i=0;i<1000;i++)count.incrementAndGet();});a.start();b.start();a.join();b.join();System.out.println(count.get());}}\n