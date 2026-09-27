/**
 * Topic: GenericQueue
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_GenericQueue {

    public static void main(String[] args) {
        java.util.Queue<Integer> queue = new java.util.ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        System.out.println(queue.poll());
    }
}
