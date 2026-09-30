/*
 * JAVA DSA
 * AREA: 07 Trees
 * CONCEPT: Binary tree traversal
 *
 * What is it?
 * Tree traversal visits nodes according to a defined order.
 *
 * Why do we need it?
 * Traversal is the foundation for tree searching, serialization, and hierarchical processing.
 *
 * Key points:
 * - Preorder is root-left-right; inorder is left-root-right; postorder is left-right-root.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Be able to trace recursive traversal and identify its output order.
 */

class Concept01_BinaryTreeTraversal{static class Node{int d;Node l,r;Node(int d){this.d=d;}}static void inorder(Node n){if(n==null)return;inorder(n.l);System.out.print(n.d+" ");inorder(n.r);}public static void main(String[]args){Node r=new Node(2);r.l=new Node(1);r.r=new Node(3);inorder(r);}}
