/*
 * JAVA MULTITHREADING
 * AREA: Executors
 * CONCEPT: thread pool types
 *
 * What is it?
 * thread pool types is an important Java concurrency concept.
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

class Concept04_ThreadPoolTypes { public static void main(String[] args){var fixed=java.util.concurrent.Executors.newFixedThreadPool(2);var single=java.util.concurrent.Executors.newSingleThreadExecutor();System.out.println(fixed);System.out.println(single);fixed.shutdown();single.shutdown();}}\n