/*
 * JAVA MULTITHREADING
 * AREA: CompletableFuture
 * CONCEPT: thenApply
 *
 * What is it?
 * thenApply is an important Java concurrency concept.
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

class Concept02_ThenApply { public static void main(String[] args)throws Exception{var f=java.util.concurrent.CompletableFuture.supplyAsync(()->"java").thenApply(String::toUpperCase);System.out.println(f.get());}}\n