/*
 * JAVA DSA
 * AREA: 02 Searching
 * CONCEPT: Two pointers
 *
 * What is it?
 * Two pointers use two indices that move through a sequence according to a condition.
 *
 * Why do we need it?
 * They can reduce nested loops in sorted-array and string problems.
 *
 * Key points:
 * - Many two-pointer solutions run in O(n) time and O(1) space.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Explain why each pointer moves and why no valid case is skipped.
 */

class Concept03_TwoPointers{static boolean pairSum(int[]a,int target){int l=0,r=a.length-1;while(l<r){int sum=a[l]+a[r];if(sum==target)return true;if(sum<target)l++;else r--;}return false;}public static void main(String[]args){System.out.println(pairSum(new int[]{1,2,4,7,11},9));}}
