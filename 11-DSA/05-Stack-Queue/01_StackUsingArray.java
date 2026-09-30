/*
 * JAVA DSA
 * AREA: 05 Stack Queue
 * CONCEPT: Stack
 *
 * What is it?
 * A stack follows LIFO: last in, first out.
 *
 * Why do we need it?
 * It models nested operations, undo behavior, and expression processing.
 *
 * Key points:
 * - Push and pop are O(1) in an array-backed stack.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Know push, pop, peek, overflow, underflow, and LIFO.
 */

class Concept01_StackUsingArray{static class Stack{int[]a=new int[5];int top=-1;void push(int x){if(top==a.length-1)throw new IllegalStateException();a[++top]=x;}int pop(){if(top<0)throw new IllegalStateException();return a[top--];}}public static void main(String[]args){Stack s=new Stack();s.push(10);s.push(20);System.out.println(s.pop());}}
