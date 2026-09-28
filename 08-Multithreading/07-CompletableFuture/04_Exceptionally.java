/*
 * JAVA MULTITHREADING
 * AREA: CompletableFuture
 * CONCEPT: exception handling
 *
 * What is it?
 * exception handling is an important Java concurrency concept.
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

class Concept04_Exceptionally { public static void main(String[] args)throws Exception{var f=java.util.concurrent.CompletableFuture.supplyAsync(()->{throw new RuntimeException("failed");}).exceptionally(e->"Fallback");System.out.println(f.get());}}\n