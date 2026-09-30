/*
 * JAVA DSA
 * AREA: 08 DSA Practice
 * CONCEPT: Combined interview practice
 *
 * What is it?
 * This example combines hashing and array traversal into a practical problem.
 *
 * Why do we need it?
 * Interview questions often require selecting a data structure before coding.
 *
 * Key points:
 * - The two-sum solution is O(n) average time and O(n) space.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * First clarify input, output, constraints, duplicates, and expected complexity.
 */

import java.util.*;class Concept04_InterviewPractice{static List<Integer>findDuplicates(int[]a){var seen=new HashSet<Integer>();var dup=new ArrayList<Integer>();for(int x:a)if(!seen.add(x)&&!dup.contains(x))dup.add(x);return dup;}public static void main(String[]args){System.out.println(findDuplicates(new int[]{1,2,3,2,4,1,5}));}}
