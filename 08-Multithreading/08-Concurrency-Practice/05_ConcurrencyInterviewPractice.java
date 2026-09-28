/*
 * JAVA MULTITHREADING
 * AREA: Concurrency Practice
 * CONCEPT: concurrency interview practice
 *
 * What is it?
 * concurrency interview practice is an important Java concurrency concept.
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

class Concept05_ConcurrencyInterviewPractice { public static void main(String[] args)throws Exception{var pool=java.util.concurrent.Executors.newSingleThreadExecutor();var f=pool.submit(()->{Thread.sleep(100);return "API response";});System.out.println(f.get(1,java.util.concurrent.TimeUnit.SECONDS));pool.shutdown();}}\n