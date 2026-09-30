/*
 * JAVA DSA
 * AREA: 02 Searching
 * CONCEPT: Sliding window
 *
 * What is it?
 * Sliding window maintains a changing range over an array or string.
 *
 * Why do we need it?
 * It avoids recomputing information for overlapping ranges.
 *
 * Key points:
 * - A typical fixed-window solution is O(n).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Identify what enters and leaves the window before writing the loop.
 */

class Concept04_SlidingWindow{static int maxSum(int[]a,int k){int sum=0;for(int i=0;i<k;i++)sum+=a[i];int best=sum;for(int i=k;i<a.length;i++){sum+=a[i]-a[i-k];best=Math.max(best,sum);}return best;}public static void main(String[]args){System.out.println(maxSum(new int[]{2,1,5,1,3,2},3));}}
