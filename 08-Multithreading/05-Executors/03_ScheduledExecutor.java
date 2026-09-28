/*
 * JAVA MULTITHREADING
 * AREA: Executors
 * CONCEPT: ScheduledExecutorService
 *
 * What is it?
 * ScheduledExecutorService is an important Java concurrency concept.
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

class Concept03_ScheduledExecutor { public static void main(String[] args)throws Exception{var pool=java.util.concurrent.Executors.newScheduledThreadPool(1);pool.schedule(()->System.out.println("Scheduled"),100,java.util.concurrent.TimeUnit.MILLISECONDS);Thread.sleep(200);pool.shutdown();}}\n