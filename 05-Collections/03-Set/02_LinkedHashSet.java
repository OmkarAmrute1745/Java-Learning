/**
 * Topic: LinkedHashSet
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept02_LinkedHashSet {

    public static void main(String[] args) {
        java.util.Set<String> values = new java.util.LinkedHashSet<>();
        values.add("Java");
        values.add("SQL");
        values.add("Java");
        System.out.println(values);
    }
}
