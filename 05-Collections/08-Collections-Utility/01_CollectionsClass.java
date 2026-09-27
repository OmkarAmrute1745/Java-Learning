/**
 * Topic: CollectionsClass
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_CollectionsClass {

    public static void main(String[] args) {
        java.util.List<Integer> numbers = new java.util.ArrayList<>(java.util.Arrays.asList(30, 10, 20));
        System.out.println(java.util.Collections.max(numbers));
        System.out.println(java.util.Collections.min(numbers));
    }
}
