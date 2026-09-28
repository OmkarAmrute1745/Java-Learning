/*
 * JAVA MULTITHREADING
 * AREA: CompletableFuture
 * CONCEPT: CompletableFuture practice
 *
 * What is it?
 * CompletableFuture practice is an important Java concurrency concept.
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

class Concept05_CompletableFuturePractice { public static void main(String[] args)throws Exception{var c=java.util.concurrent.CompletableFuture.supplyAsync(()->"Customer");var o=java.util.concurrent.CompletableFuture.supplyAsync(()->"Orders");System.out.println(c.thenCombine(o,(x,y)->x+" + "+y).get());}}\n