/*
 * JAVA MULTITHREADING
 * AREA: Thread Control
 * CONCEPT: daemon thread
 *
 * What is it?
 * daemon thread is an important Java concurrency concept.
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

class Concept04_DaemonThread { public static void main(String[] args){Thread t=new Thread(()->{try{Thread.sleep(1000);}catch(InterruptedException e){}});t.setDaemon(true);t.start();System.out.println("Main ends");}}\n