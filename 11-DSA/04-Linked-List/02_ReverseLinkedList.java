/*
 * JAVA DSA
 * AREA: 04 Linked List
 * CONCEPT: Reverse linked list
 *
 * What is it?
 * Reversing a linked list changes each next reference to point backward.
 *
 * Why do we need it?
 * It is a common pointer-manipulation interview problem.
 *
 * Key points:
 * - Time is O(n) and iterative extra space is O(1).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Explain previous, current, and next pointers before changing links.
 */

class Concept02_ReverseLinkedList{static class Node{int d;Node n;Node(int d){this.d=d;}}static Node reverse(Node h){Node p=null,c=h;while(c!=null){Node next=c.n;c.n=p;p=c;c=next;}return p;}public static void main(String[]args){Node h=new Node(1);h.n=new Node(2);h.n.n=new Node(3);h=reverse(h);for(Node x=h;x!=null;x=x.n)System.out.print(x.d+" ");}}
