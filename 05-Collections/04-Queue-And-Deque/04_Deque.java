/**
 * Topic: Deque
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_Deque {

    public static void main(String[] args) {
        java.util.Deque<Integer> deque = new java.util.ArrayDeque<>();
        deque.offerFirst(10);
        deque.offerLast(20);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
