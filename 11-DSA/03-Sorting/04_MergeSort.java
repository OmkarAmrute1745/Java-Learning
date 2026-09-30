/*
 * JAVA DSA
 * AREA: 03 Sorting
 * CONCEPT: Merge sort
 *
 * What is it?
 * Merge sort divides an array, sorts the halves, and merges them.
 *
 * Why do we need it?
 * It provides predictable O(n log n) sorting time.
 *
 * Key points:
 * - Time is O(n log n) and auxiliary space is O(n).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Understand divide, recursive sort, and merge as three separate steps.
 */

import java.util.Arrays;class Concept04_MergeSort{static void sort(int[]a,int l,int r){if(l>=r)return;int m=l+(r-l)/2;sort(a,l,m);sort(a,m+1,r);merge(a,l,m,r);}static void merge(int[]a,int l,int m,int r){int[]t=new int[r-l+1];int i=l,j=m+1,k=0;while(i<=m&&j<=r)t[k++]=a[i]<=a[j]?a[i++]:a[j++];while(i<=m)t[k++]=a[i++];while(j<=r)t[k++]=a[j++];System.arraycopy(t,0,a,l,t.length);}public static void main(String[]args){int[]a={5,1,4,2,8};sort(a,0,a.length-1);System.out.println(Arrays.toString(a));}}
