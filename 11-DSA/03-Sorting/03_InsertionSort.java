/*
 * JAVA DSA
 * AREA: 03 Sorting
 * CONCEPT: Insertion sort
 *
 * What is it?
 * Insertion sort builds a sorted prefix by inserting each element into its position.
 *
 * Why do we need it?
 * It performs well for small or nearly sorted arrays.
 *
 * Key points:
 * - Worst-case time is O(n²), best case is O(n), and space is O(1).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Explain why insertion sort can be efficient on nearly sorted data.
 */

import java.util.Arrays;class Concept03_InsertionSort{static void sort(int[]a){for(int i=1;i<a.length;i++){int key=a[i],j=i-1;while(j>=0&&a[j]>key){a[j+1]=a[j];j--;}a[j+1]=key;}}public static void main(String[]args){int[]a={5,2,4,6,1,3};sort(a);System.out.println(Arrays.toString(a));}}
