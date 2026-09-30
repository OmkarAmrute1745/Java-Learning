/*
 * JAVA DSA
 * AREA: 07 Trees
 * CONCEPT: Level-order traversal
 *
 * What is it?
 * Level-order traversal visits a tree one level at a time.
 *
 * Why do we need it?
 * A queue naturally represents the nodes waiting to be processed.
 *
 * Key points:
 * - Time is O(n) and space can be O(n).
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Know why BFS uses a queue while DFS commonly uses recursion or a stack.
 */

import java.util.*;class Concept04_LevelOrderTraversal{static class Node{int d;Node l,r;Node(int d){this.d=d;}}static void bfs(Node root){if(root==null)return;var q=new ArrayDeque<Node>();q.add(root);while(!q.isEmpty()){Node n=q.remove();System.out.print(n.d+" ");if(n.l!=null)q.add(n.l);if(n.r!=null)q.add(n.r);}}public static void main(String[]args){Node r=new Node(1);r.l=new Node(2);r.r=new Node(3);r.l.l=new Node(4);bfs(r);}}
