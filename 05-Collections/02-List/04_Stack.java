/**
 * Topic: Stack
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_Stack {

    public static void main(String[] args) {
        java.util.Stack<String> stack = new java.util.Stack<>();
        stack.push("First");
        stack.push("Second");
        System.out.println(stack.pop());
    }
}
