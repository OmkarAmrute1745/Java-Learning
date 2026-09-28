/*
 * JAVA MULTITHREADING
 * AREA: Executors
 * CONCEPT: Callable and Future
 *
 * What is it?
 * Callable and Future is an important Java concurrency concept.
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

class Concept02_CallableAndFuture { public static void main(String[] args)throws Exception{var pool=java.util.concurrent.Executors.newSingleThreadExecutor();var f=pool.submit(()->40+2);System.out.println(f.get());pool.shutdown();}}\n