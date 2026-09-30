/*
 * JAVA DSA
 * AREA: 06 Hashing
 * CONCEPT: Duplicate detection
 *
 * What is it?
 * Hashing can track values already seen while scanning an input.
 *
 * Why do we need it?
 * It avoids repeated nested comparisons.
 *
 * Key points:
 * - Average time is O(n) and space is O(n).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Compare hash-based detection with sorting-based detection.
 */

import java.util.HashSet;class Concept03_DuplicateDetection{static boolean hasDuplicate(int[]a){var s=new HashSet<Integer>();for(int x:a)if(!s.add(x))return true;return false;}public static void main(String[]args){System.out.println(hasDuplicate(new int[]{1,2,3,2}));}}
