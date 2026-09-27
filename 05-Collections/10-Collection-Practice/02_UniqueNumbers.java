/**
 * Topic: UniqueNumbers
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept02_UniqueNumbers {

    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(10, 20, 10, 30, 20);
        java.util.Set<Integer> unique = new java.util.LinkedHashSet<>(numbers);
        System.out.println(unique);
    }
}
