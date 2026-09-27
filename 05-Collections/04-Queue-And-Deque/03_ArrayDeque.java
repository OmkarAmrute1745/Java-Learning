/**
 * Topic: ArrayDeque
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_ArrayDeque {

    public static void main(String[] args) {
        java.util.ArrayDeque<String> deque = new java.util.ArrayDeque<>();
        deque.addFirst("First");
        deque.addLast("Last");
        System.out.println(deque);
    }
}
