/**
 * Topic: GenericSorting
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_GenericSorting {

    public static void main(String[] args) {
        java.util.List<Integer> values = new java.util.ArrayList<>(java.util.Arrays.asList(30, 10, 20));
        values.sort(java.util.Comparator.naturalOrder());
        System.out.println(values);
    }
}
