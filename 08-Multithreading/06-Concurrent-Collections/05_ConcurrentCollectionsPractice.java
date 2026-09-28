/*
 * JAVA MULTITHREADING
 * AREA: Concurrent Collections
 * CONCEPT: concurrent collections practice
 *
 * What is it?
 * concurrent collections practice is an important Java concurrency concept.
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

class Concept05_ConcurrentCollectionsPractice { public static void main(String[] args){var visits=new java.util.concurrent.ConcurrentHashMap<String,Integer>();visits.merge("/home",1,Integer::sum);visits.merge("/home",1,Integer::sum);System.out.println(visits);}}\n