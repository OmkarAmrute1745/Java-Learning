/*
 * JAVA DSA
 * AREA: 01 DSA Basics
 * CONCEPT: Big-O notation
 *
 * What is it?
 * Big-O describes how an algorithm grows as input size increases.
 *
 * Why do we need it?
 * It helps compare algorithms and estimate scalability.
 *
 * Key points:
 * - O(1), O(log n), O(n), O(n log n), and O(n²) are common complexities.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Always state time complexity and auxiliary space when explaining an algorithm.
 */

class Concept01_BigONotation{static void constant(){System.out.println("O(1)");}static void linear(int n){for(int i=0;i<n;i++)System.out.print(i+" ");System.out.println();}public static void main(String[]args){constant();linear(5);System.out.println("Nested loop example: O(n^2)");}}
