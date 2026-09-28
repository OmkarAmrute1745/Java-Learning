/*
 * JAVA MULTITHREADING
 * AREA: Concurrency Practice
 * CONCEPT: task aggregation
 *
 * What is it?
 * task aggregation is an important Java concurrency concept.
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

class Concept03_TaskAggregation { public static void main(String[] args)throws Exception{var pool=java.util.concurrent.Executors.newFixedThreadPool(3);var fs=new java.util.ArrayList<java.util.concurrent.Future<Integer>>();for(int i=1;i<=3;i++){int n=i;fs.add(pool.submit(()->n*n));}int total=0;for(var f:fs)total+=f.get();pool.shutdown();System.out.println(total);}}\n