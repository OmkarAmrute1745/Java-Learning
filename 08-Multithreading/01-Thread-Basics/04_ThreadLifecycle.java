/*
 * JAVA MULTITHREADING
 * AREA: Thread Basics
 * CONCEPT: Thread lifecycle
 *
 * What is it?
 * Thread lifecycle is an important Java concurrency concept.
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

class Concept04_ThreadLifecycle { public static void main(String[] args)throws Exception{Thread t=new Thread(()->{try{Thread.sleep(50);}catch(InterruptedException e){Thread.currentThread().interrupt();}});System.out.println(t.getState());t.start();t.join();System.out.println(t.getState());}}\n