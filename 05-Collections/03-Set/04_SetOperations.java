/**
 * Topic: SetOperations
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_SetOperations {

    public static void main(String[] args) {
        java.util.Set<Integer> first = new java.util.HashSet<>(java.util.Arrays.asList(1, 2, 3));
        java.util.Set<Integer> second = new java.util.HashSet<>(java.util.Arrays.asList(3, 4, 5));
        java.util.Set<Integer> union = new java.util.HashSet<>(first);
        union.addAll(second);
        System.out.println("Union: " + union);
    }
}
