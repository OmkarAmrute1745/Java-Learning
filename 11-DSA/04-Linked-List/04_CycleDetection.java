/*
 * JAVA DSA
 * AREA: 04 Linked List
 * CONCEPT: Cycle detection
 *
 * What is it?
 * Cycle detection determines whether a linked list contains a loop.
 *
 * Why do we need it?
 * It prevents infinite traversal and is a classic fast-slow pointer problem.
 *
 * Key points:
 * - Floyd's algorithm runs in O(n) time and O(1) space.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Explain why moving one pointer twice as fast guarantees a meeting when a cycle exists.
 */

class Concept04_CycleDetection{static class Node{int d;Node n;Node(int d){this.d=d;}}static boolean hasCycle(Node h){Node s=h,f=h;while(f!=null&&f.n!=null){s=s.n;f=f.n.n;if(s==f)return true;}return false;}public static void main(String[]args){Node a=new Node(1),b=new Node(2),c=new Node(3);a.n=b;b.n=c;c.n=a;System.out.println(hasCycle(a));}}
