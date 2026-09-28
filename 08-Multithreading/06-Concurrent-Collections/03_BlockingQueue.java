/*
 * JAVA MULTITHREADING
 * AREA: Concurrent Collections
 * CONCEPT: BlockingQueue
 *
 * What is it?
 * BlockingQueue is an important Java concurrency concept.
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

class Concept03_BlockingQueue { public static void main(String[] args)throws Exception{var q=new java.util.concurrent.ArrayBlockingQueue<Integer>(2);q.put(10);q.put(20);System.out.println(q.take());System.out.println(q.take());}}\n