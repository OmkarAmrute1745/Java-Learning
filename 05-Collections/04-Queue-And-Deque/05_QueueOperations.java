/**
 * Topic: QueueOperations
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_QueueOperations {

    public static void main(String[] args) {
        java.util.Queue<String> queue = new java.util.ArrayDeque<>();
        queue.offer("A");
        queue.offer("B");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}
