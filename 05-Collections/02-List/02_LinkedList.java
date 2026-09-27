/**
 * Topic: LinkedList
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept02_LinkedList {

    public static void main(String[] args) {
        java.util.LinkedList<String> tasks = new java.util.LinkedList<>();
        tasks.addFirst("Start");
        tasks.addLast("Finish");
        System.out.println(tasks);
    }
}
