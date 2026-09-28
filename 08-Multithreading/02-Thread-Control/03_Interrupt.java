/*
 * JAVA MULTITHREADING
 * AREA: Thread Control
 * CONCEPT: interrupt
 *
 * What is it?
 * interrupt is an important Java concurrency concept.
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

class Concept03_Interrupt { public static void main(String[] args)throws Exception{Thread t=new Thread(()->{try{Thread.sleep(5000);}catch(InterruptedException e){System.out.println("Interrupted");Thread.currentThread().interrupt();}});t.start();Thread.sleep(100);t.interrupt();t.join();}}\n