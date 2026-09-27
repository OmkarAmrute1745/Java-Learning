/**
 * Topic: SuppressWarnings
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_SuppressWarnings {

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        java.util.List<String> names = new java.util.ArrayList();
        names.add("Java");
        System.out.println(names);
    }
}
