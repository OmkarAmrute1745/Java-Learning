/**
 * Topic: ArrayListVsLinkedList
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept06_ArrayListVsLinkedList {

    public static void main(String[] args) {
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("ArrayList is good for indexed access.");
        list.add("LinkedList is useful for frequent linked operations.");
        System.out.println(list);
    }
}
