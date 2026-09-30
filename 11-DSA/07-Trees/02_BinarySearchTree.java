/*
 * JAVA DSA
 * AREA: 07 Trees
 * CONCEPT: Binary search tree
 *
 * What is it?
 * A BST keeps smaller values on the left and larger values on the right.
 *
 * Why do we need it?
 * The ordering supports efficient search when the tree is balanced.
 *
 * Key points:
 * - Average search can be O(log n), but worst case is O(n).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Always mention that an unbalanced BST can degrade to a linked list.
 */

class Concept02_BinarySearchTree{static class Node{int d;Node l,r;Node(int d){this.d=d;}}static Node insert(Node n,int x){if(n==null)return new Node(x);if(x<n.d)n.l=insert(n.l,x);else if(x>n.d)n.r=insert(n.r,x);return n;}static boolean search(Node n,int x){while(n!=null){if(n.d==x)return true;n=x<n.d?n.l:n.r;}return false;}public static void main(String[]args){Node r=null;for(int x:new int[]{8,3,10,1,6})r=insert(r,x);System.out.println(search(r,6));}}
