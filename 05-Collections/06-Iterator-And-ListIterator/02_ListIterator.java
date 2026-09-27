/**
 * Topic: ListIterator
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept02_ListIterator {

    public static void main(String[] args) {
        java.util.List<String> values = new java.util.ArrayList<>(java.util.Arrays.asList("Java", "SQL"));
        java.util.ListIterator<String> iterator = values.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
