/*
 * JAVA DSA
 * AREA: 02 Searching
 * CONCEPT: Linear search
 *
 * What is it?
 * Linear search checks elements one by one until the target is found.
 *
 * Why do we need it?
 * It works on unsorted data and is simple to implement.
 *
 * Key points:
 * - Worst-case time is O(n) and extra space is O(1).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Know when linear search is preferable to preprocessing the data.
 */

class Concept01_LinearSearch{static int search(int[]a,int target){for(int i=0;i<a.length;i++)if(a[i]==target)return i;return -1;}public static void main(String[]args){System.out.println(search(new int[]{4,8,2,9},9));}}
