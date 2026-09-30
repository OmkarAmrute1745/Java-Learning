/*
 * JAVA DSA
 * AREA: 06 Hashing
 * CONCEPT: Grouping with hashing
 *
 * What is it?
 * Grouping maps a key to a collection of related values.
 *
 * Why do we need it?
 * It is common in backend processing, reporting, and interview problems.
 *
 * Key points:
 * - Average time is O(n) excluding output costs.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Know how a map of lists models one-to-many relationships.
 */

import java.util.*;class Concept04_Grouping{public static void main(String[]args){var words=List.of("apple","ant","ball","bat");var groups=new HashMap<Character,List<String>>();for(String w:words)groups.computeIfAbsent(w.charAt(0),k->new ArrayList<>()).add(w);System.out.println(groups);}}
