/*
 * JAVA DSA
 * AREA: 01 DSA Basics
 * CONCEPT: Recursion
 *
 * What is it?
 * Recursion is a technique where a method calls itself on a smaller problem.
 *
 * Why do we need it?
 * It naturally represents tree traversal, divide-and-conquer, and backtracking.
 *
 * Key points:
 * - Every recursive solution needs a base case and progress toward it.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Be able to trace the call stack and explain recursive space usage.
 */

class Concept04_Recursion{static int factorial(int n){if(n<=1)return 1;return n*factorial(n-1);}public static void main(String[]args){System.out.println(factorial(5));}}
