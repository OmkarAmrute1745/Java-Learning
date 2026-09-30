/*
 * JAVA DSA
 * AREA: 08 DSA Practice
 * CONCEPT: Maximum subarray
 *
 * What is it?
 * The maximum subarray problem finds the contiguous range with the largest sum.
 *
 * Why do we need it?
 * Kadane's algorithm solves it without checking every possible range.
 *
 * Key points:
 * - Time is O(n) and extra space is O(1).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Explain why the current best prefix is either extended or restarted.
 */

class Concept02_MaximumSubarray{static int maxSum(int[]a){int best=a[0],current=a[0];for(int i=1;i<a.length;i++){current=Math.max(a[i],current+a[i]);best=Math.max(best,current);}return best;}public static void main(String[]args){System.out.println(maxSum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));}}
