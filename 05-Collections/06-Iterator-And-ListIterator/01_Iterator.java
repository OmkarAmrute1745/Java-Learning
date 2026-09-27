/**
 * Topic: Iterator
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_Iterator {

    public static void main(String[] args) {
        java.util.List<String> values = new java.util.ArrayList<>(java.util.Arrays.asList("Java", "SQL"));
        java.util.Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
