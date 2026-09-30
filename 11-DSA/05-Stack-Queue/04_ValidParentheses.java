/*
 * JAVA DSA
 * AREA: 05 Stack Queue
 * CONCEPT: Valid parentheses
 *
 * What is it?
 * A stack can verify whether opening and closing brackets are properly nested.
 *
 * Why do we need it?
 * It models the last unmatched opening bracket.
 *
 * Key points:
 * - Time is O(n) and space is O(n) in the worst case.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Explain why the most recent opening bracket must be closed first.
 */

import java.util.ArrayDeque;class Concept04_ValidParentheses{static boolean valid(String s){var st=new ArrayDeque<Character>();for(char c:s.toCharArray()){if(c=='('||c=='['||c=='{')st.push(c);else{if(st.isEmpty())return false;char o=st.pop();if(c==')'&&o!='('||c==']'&&o!='['||c=='}'&&o!='{')return false;}}return st.isEmpty();}public static void main(String[]args){System.out.println(valid("{[()]}"));}}
