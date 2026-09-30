/*
 * JAVA DSA
 * AREA: 03 Sorting
 * CONCEPT: Selection sort
 *
 * What is it?
 * Selection sort repeatedly selects the smallest remaining element.
 *
 * Why do we need it?
 * It demonstrates selection and in-place swapping.
 *
 * Key points:
 * - Time is O(n²) and space is O(1).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Compare it with insertion sort and mention that both are quadratic in the worst case.
 */

import java.util.Arrays;class Concept02_SelectionSort{static void sort(int[]a){for(int i=0;i<a.length-1;i++){int min=i;for(int j=i+1;j<a.length;j++)if(a[j]<a[min])min=j;int t=a[i];a[i]=a[min];a[min]=t;}}public static void main(String[]args){int[]a={64,25,12,22,11};sort(a);System.out.println(Arrays.toString(a));}}
