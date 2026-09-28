/*
 * JAVA MULTITHREADING
 * AREA: Concurrency Practice
 * CONCEPT: producer consumer
 *
 * What is it?
 * producer consumer is an important Java concurrency concept.
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

class Concept01_ProducerConsumer { public static void main(String[] args)throws Exception{var q=new java.util.concurrent.ArrayBlockingQueue<Integer>(5);Thread p=new Thread(()->{try{for(int i=1;i<=5;i++)q.put(i);}catch(InterruptedException e){Thread.currentThread().interrupt();}});Thread c=new Thread(()->{try{for(int i=1;i<=5;i++)System.out.println("Consumed "+q.take());}catch(InterruptedException e){Thread.currentThread().interrupt();}});p.start();c.start();p.join();c.join();}}\n