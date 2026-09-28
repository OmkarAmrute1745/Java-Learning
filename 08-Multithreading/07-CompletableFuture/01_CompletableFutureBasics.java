/*
 * JAVA MULTITHREADING
 * AREA: CompletableFuture
 * CONCEPT: CompletableFuture basics
 *
 * What is it?
 * CompletableFuture basics is an important Java concurrency concept.
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

class Concept01_CompletableFutureBasics { public static void main(String[] args)throws Exception{var f=java.util.concurrent.CompletableFuture.supplyAsync(()->"Java Backend");System.out.println(f.get());}}\n