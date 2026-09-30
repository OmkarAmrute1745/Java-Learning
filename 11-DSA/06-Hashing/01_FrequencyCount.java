/*
 * JAVA DSA
 * AREA: 06 Hashing
 * CONCEPT: Frequency counting
 *
 * What is it?
 * A hash map can store each value and its number of occurrences.
 *
 * Why do we need it?
 * It converts repeated searching into average constant-time lookups.
 *
 * Key points:
 * - Typical time is O(n) and space is O(k), where k is the number of distinct values.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Know why hashing is useful for counting and lookup problems.
 */

import java.util.HashMap;class Concept01_FrequencyCount{public static void main(String[]args){int[]a={2,3,2,4,3,2};var m=new HashMap<Integer,Integer>();for(int x:a)m.put(x,m.getOrDefault(x,0)+1);System.out.println(m);}}
