/*
 * JAVA MULTITHREADING
 * AREA: Synchronization
 * CONCEPT: synchronized block
 *
 * What is it?
 * synchronized block is an important Java concurrency concept.
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

class Concept03_SynchronizedBlock { static int value;static void inc(){synchronized(Concept03_SynchronizedBlock.class){value++;}}public static void main(String[] args)throws Exception{Thread a=new Thread(()->{for(int i=0;i<10000;i++)inc();});Thread b=new Thread(()->{for(int i=0;i<10000;i++)inc();});a.start();b.start();a.join();b.join();System.out.println(value);}}\n