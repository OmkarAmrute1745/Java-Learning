/*
 * JAVA DSA
 * AREA: 04 Linked List
 * CONCEPT: Singly linked list
 *
 * What is it?
 * A singly linked list stores nodes where each node points to the next node.
 *
 * Why do we need it?
 * It supports efficient insertion when a node position is already known.
 *
 * Key points:
 * - Traversal is O(n); insertion at the head is O(1).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Know node structure, head reference, traversal, and pointer updates.
 */

class Concept01_SinglyLinkedList{static class Node{int data;Node next;Node(int d){data=d;}}public static void main(String[]args){Node head=new Node(10);head.next=new Node(20);head.next.next=new Node(30);for(Node n=head;n!=null;n=n.next)System.out.print(n.data+" ");}}
