/*
 * JAVA DSA
 * AREA: 06 Hashing
 * CONCEPT: Two Sum
 *
 * What is it?
 * Two Sum finds two values whose sum equals a target.
 *
 * Why do we need it?
 * A hash map stores previously seen values so each new value can be checked quickly.
 *
 * Key points:
 * - Average time is O(n) and space is O(n).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Explain the complement: target minus the current value.
 */

import java.util.HashMap;class Concept02_TwoSum{static int[] twoSum(int[]a,int target){var m=new HashMap<Integer,Integer>();for(int i=0;i<a.length;i++){int need=target-a[i];if(m.containsKey(need))return new int[]{m.get(need),i};m.put(a[i],i);}return new int[0];}public static void main(String[]args){int[]r=twoSum(new int[]{2,7,11,15},9);System.out.println(r[0]+" "+r[1]);}}
