/*
 * JAVA DSA
 * AREA: 03 Sorting
 * CONCEPT: Bubble sort
 *
 * What is it?
 * Bubble sort repeatedly swaps adjacent elements that are out of order.
 *
 * Why do we need it?
 * It is useful for learning comparison and swapping mechanics.
 *
 * Key points:
 * - Worst-case time is O(n²) and space is O(1).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Know why the largest unsorted element moves to the end each pass.
 */

import java.util.Arrays;class Concept01_BubbleSort{static void sort(int[]a){for(int i=0;i<a.length-1;i++){boolean swapped=false;for(int j=0;j<a.length-1-i;j++)if(a[j]>a[j+1]){int t=a[j];a[j]=a[j+1];a[j+1]=t;swapped=true;}if(!swapped)break;}}public static void main(String[]args){int[]a={5,2,8,1,3};sort(a);System.out.println(Arrays.toString(a));}}
