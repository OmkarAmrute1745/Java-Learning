/*
 * JAVA DSA
 * AREA: 08 DSA Practice
 * CONCEPT: Merge sorted arrays
 *
 * What is it?
 * Merging sorted arrays combines two ordered inputs using two pointers.
 *
 * Why do we need it?
 * It is a core operation behind merge sort and many interview problems.
 *
 * Key points:
 * - Time is O(n+m) and output space is O(n+m).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Explain why the smallest front element can safely be chosen at each step.
 */

import java.util.*;class Concept03_MergeSortedArrays{static int[]merge(int[]a,int[]b){int[]r=new int[a.length+b.length];int i=0,j=0,k=0;while(i<a.length&&j<b.length)r[k++]=a[i]<=b[j]?a[i++]:b[j++];while(i<a.length)r[k++]=a[i++];while(j<b.length)r[k++]=b[j++];return r;}public static void main(String[]args){System.out.println(Arrays.toString(merge(new int[]{1,4,7},new int[]{2,3,8})));}}
