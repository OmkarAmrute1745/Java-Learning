/*
 * JAVA DSA
 * AREA: 07 Trees
 * CONCEPT: Tree height
 *
 * What is it?
 * Tree height is the longest path from the root to a leaf.
 *
 * Why do we need it?
 * It helps analyze recursive tree algorithms and balance.
 *
 * Key points:
 * - A recursive height calculation visits each node once: O(n).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Clarify whether height counts edges or nodes when answering an interview question.
 */

class Concept03_TreeHeight{static class Node{int d;Node l,r;Node(int d){this.d=d;}}static int height(Node n){if(n==null)return 0;return 1+Math.max(height(n.l),height(n.r));}public static void main(String[]args){Node r=new Node(1);r.l=new Node(2);r.l.l=new Node(4);r.r=new Node(3);System.out.println(height(r));}}
