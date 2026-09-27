/**
 * Topic: GenericStack
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class GenericStack<T> {
    private final java.util.Deque<T> stack = new java.util.ArrayDeque<>();
    void push(T value) { stack.push(value); }
    T pop() { return stack.pop(); }
}
class Concept03_GenericStack {

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
    }
}
