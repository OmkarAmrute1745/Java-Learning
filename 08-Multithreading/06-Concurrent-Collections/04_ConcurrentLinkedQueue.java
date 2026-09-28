/*
 * JAVA MULTITHREADING
 * AREA: Concurrent Collections
 * CONCEPT: ConcurrentLinkedQueue
 *
 * What is it?
 * ConcurrentLinkedQueue is an important Java concurrency concept.
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

class Concept04_ConcurrentLinkedQueue { public static void main(String[] args){var q=new java.util.concurrent.ConcurrentLinkedQueue<Integer>();q.offer(10);q.offer(20);System.out.println(q.poll());System.out.println(q.poll());}}\n