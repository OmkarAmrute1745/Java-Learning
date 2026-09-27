/**
 * Topic: PriorityQueue
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept02_PriorityQueue {

    public static void main(String[] args) {
        java.util.Queue<Integer> queue = new java.util.PriorityQueue<>();
        queue.offer(30);
        queue.offer(10);
        queue.offer(20);
        System.out.println(queue.poll());
    }
}
