/*
 * JAVA DSA
 * AREA: 05 Stack Queue
 * CONCEPT: Deque
 *
 * What is it?
 * A deque allows insertion and removal from both ends.
 *
 * Why do we need it?
 * It is useful for sliding-window algorithms and double-ended processing.
 *
 * Key points:
 * - Operations at both ends are O(1) with a suitable deque implementation.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Know the difference between stack, queue, and deque.
 */

import java.util.ArrayDeque;class Concept03_Deque{public static void main(String[]args){var d=new ArrayDeque<Integer>();d.addFirst(20);d.addLast(30);d.addFirst(10);System.out.println(d);System.out.println(d.removeLast());}}
