/**
 * Topic: GenericIterator
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_GenericIterator {

    public static void main(String[] args) {
        java.util.List<String> values = java.util.Arrays.asList("Java", "SQL");
        java.util.Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
