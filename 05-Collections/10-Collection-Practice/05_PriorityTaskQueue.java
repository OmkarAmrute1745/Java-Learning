/**
 * Topic: PriorityTaskQueue
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Task implements Comparable<Task> {
    String name;
    int priority;
    Task(String name, int priority) { this.name = name; this.priority = priority; }
    public int compareTo(Task other) { return Integer.compare(this.priority, other.priority); }
    public String toString() { return name; }
}
class Concept05_PriorityTaskQueue {

    public static void main(String[] args) {
        java.util.Queue<Task> tasks = new java.util.PriorityQueue<>();
        tasks.offer(new Task("Normal", 3));
        tasks.offer(new Task("Urgent", 1));
        tasks.offer(new Task("Low", 5));
        System.out.println(tasks.poll());
    }
}
