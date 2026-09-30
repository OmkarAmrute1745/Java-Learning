/*
 * JAVA DSA
 * AREA: 02 Searching
 * CONCEPT: Binary search
 *
 * What is it?
 * Binary search repeatedly halves a sorted search space.
 *
 * Why do we need it?
 * It provides logarithmic search time on sorted data.
 *
 * Key points:
 * - Time is O(log n) and extra space is O(1) for iterative code.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * The array must be sorted and the midpoint calculation should avoid overflow.
 */

class Concept02_BinarySearch{static int search(int[]a,int target){int l=0,r=a.length-1;while(l<=r){int m=l+(r-l)/2;if(a[m]==target)return m;if(a[m]<target)l=m+1;else r=m-1;}return -1;}public static void main(String[]args){System.out.println(search(new int[]{2,4,6,8,10},8));}}
