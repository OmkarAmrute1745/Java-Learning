/*
 * JAVA MULTITHREADING
 * AREA: Thread Control
 * CONCEPT: sleep
 *
 * What is it?
 * sleep is an important Java concurrency concept.
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

class Concept01_Sleep { public static void main(String[] args)throws Exception{for(int i=1;i<=3;i++){System.out.println(i);Thread.sleep(100);}}}\n