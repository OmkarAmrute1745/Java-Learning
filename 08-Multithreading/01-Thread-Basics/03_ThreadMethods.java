/*
 * JAVA MULTITHREADING
 * AREA: Thread Basics
 * CONCEPT: Thread methods
 *
 * What is it?
 * Thread methods is an important Java concurrency concept.
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

class Concept03_ThreadMethods { public static void main(String[] args)throws Exception{Thread t=new Thread(()->{try{Thread.sleep(100);System.out.println(Thread.currentThread().getName());}catch(InterruptedException e){Thread.currentThread().interrupt();}});t.start();t.join();}}\n