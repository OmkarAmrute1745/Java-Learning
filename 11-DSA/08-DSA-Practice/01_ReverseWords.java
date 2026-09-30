/*
 * JAVA DSA
 * AREA: 08 DSA Practice
 * CONCEPT: Reverse words
 *
 * What is it?
 * Reversing words tests string traversal and careful input handling.
 *
 * Why do we need it?
 * It is a common interview exercise with multiple possible approaches.
 *
 * Key points:
 * - A split-and-reverse solution is easy to understand; manual parsing can reduce allocations.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Discuss both readability and complexity before choosing an approach.
 */

class Concept01_ReverseWords{public static void main(String[]args){String s="Java makes backend development powerful";String[]w=s.split(" ");StringBuilder out=new StringBuilder();for(int i=w.length-1;i>=0;i--){out.append(w[i]);if(i>0)out.append(' ');}System.out.println(out);}}
