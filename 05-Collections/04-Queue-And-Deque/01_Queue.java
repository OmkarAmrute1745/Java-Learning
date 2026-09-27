/**
 * Topic: Queue
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_Queue {

    public static void main(String[] args) {
        java.util.Queue<String> queue = new java.util.LinkedList<>();
        queue.offer("Task-1");
        queue.offer("Task-2");
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
