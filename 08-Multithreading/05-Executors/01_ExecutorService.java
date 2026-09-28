/*
 * JAVA MULTITHREADING
 * AREA: Executors
 * CONCEPT: ExecutorService
 *
 * What is it?
 * ExecutorService is an important Java concurrency concept.
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

class Concept01_ExecutorService { public static void main(String[] args)throws Exception{var pool=java.util.concurrent.Executors.newFixedThreadPool(2);for(int i=1;i<=4;i++){int n=i;pool.submit(()->System.out.println("Task "+n));}pool.shutdown();pool.awaitTermination(1,java.util.concurrent.TimeUnit.SECONDS);}}\n