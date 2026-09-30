/*
 * JAVA DSA
 * AREA: 05 Stack Queue
 * CONCEPT: Queue
 *
 * What is it?
 * A queue follows FIFO: first in, first out.
 *
 * Why do we need it?
 * It models scheduling, buffering, and breadth-first processing.
 *
 * Key points:
 * - Circular queues can provide O(1) enqueue and dequeue.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Know front, rear, FIFO, and why a circular queue avoids wasted space.
 */

class Concept02_QueueUsingArray{static class Queue{int[]a=new int[5];int f=0,r=0;void add(int x){a[r++]=x;}int remove(){return a[f++];}}public static void main(String[]args){Queue q=new Queue();q.add(10);q.add(20);System.out.println(q.remove());}}
