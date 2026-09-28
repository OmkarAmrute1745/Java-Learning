/*
 * JAVA MULTITHREADING
 * AREA: Concurrency Practice
 * CONCEPT: parallel stream
 *
 * What is it?
 * parallel stream is an important Java concurrency concept.
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

class Concept04_ParallelStream { public static void main(String[] args){var numbers=java.util.stream.IntStream.rangeClosed(1,10).boxed().toList();numbers.parallelStream().map(n->n*n).forEach(n->System.out.println(Thread.currentThread().getName()+" -> "+n));}}\n