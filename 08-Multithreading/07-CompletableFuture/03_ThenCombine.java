/*
 * JAVA MULTITHREADING
 * AREA: CompletableFuture
 * CONCEPT: thenCombine
 *
 * What is it?
 * thenCombine is an important Java concurrency concept.
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

class Concept03_ThenCombine { public static void main(String[] args)throws Exception{var a=java.util.concurrent.CompletableFuture.supplyAsync(()->100);var b=java.util.concurrent.CompletableFuture.supplyAsync(()->18);System.out.println(a.thenCombine(b,Integer::sum).get());}}\n