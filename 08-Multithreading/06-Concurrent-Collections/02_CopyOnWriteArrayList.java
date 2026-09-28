/*
 * JAVA MULTITHREADING
 * AREA: Concurrent Collections
 * CONCEPT: CopyOnWriteArrayList
 *
 * What is it?
 * CopyOnWriteArrayList is an important Java concurrency concept.
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

class Concept02_CopyOnWriteArrayList { public static void main(String[] args){var list=new java.util.concurrent.CopyOnWriteArrayList<String>();list.add("Java");for(String s:list){System.out.println(s);list.add("Spring");break;}System.out.println(list);}}\n