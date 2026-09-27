/**
 * Topic: UnmodifiableCollections
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_UnmodifiableCollections {

    public static void main(String[] args) {
        java.util.List<String> values = java.util.Collections.unmodifiableList(java.util.Arrays.asList("Java", "SQL"));
        System.out.println(values);
    }
}
