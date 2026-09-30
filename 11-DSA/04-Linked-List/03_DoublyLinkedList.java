/*
 * JAVA DSA
 * AREA: 04 Linked List
 * CONCEPT: Doubly linked list
 *
 * What is it?
 * A doubly linked list stores links to both previous and next nodes.
 *
 * Why do we need it?
 * It supports movement in both directions and easier deletion with a node reference.
 *
 * Key points:
 * - Traversal is O(n); insertion or deletion can be O(1) with the correct node reference.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Know the extra memory cost compared with a singly linked list.
 */

class Concept03_DoublyLinkedList{static class Node{int d;Node p,n;Node(int d){this.d=d;}}public static void main(String[]args){Node a=new Node(10),b=new Node(20);a.n=b;b.p=a;System.out.println(a.d+" <-> "+a.n.d);}}
