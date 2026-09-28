/*
 * JAVA MULTITHREADING
 * AREA: Synchronization
 * CONCEPT: synchronized method
 *
 * What is it?
 * synchronized method is an important Java concurrency concept.
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

class Concept02_SynchronizedMethod { static class Counter{private int value;synchronized void increment(){value++;}int get(){return value;}}public static void main(String[] args)throws Exception{Counter c=new Counter();Thread a=new Thread(()->{for(int i=0;i<10000;i++)c.increment();});Thread b=new Thread(()->{for(int i=0;i<10000;i++)c.increment();});a.start();b.start();a.join();b.join();System.out.println(c.get());}}\n