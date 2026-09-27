/**
 * Topic: SortingWithComparator
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_SortingWithComparator {

    public static void main(String[] args) {
        java.util.List<String> names = new java.util.ArrayList<>(java.util.Arrays.asList("Omkar", "Amit", "Zoya"));
        names.sort(java.util.Comparator.reverseOrder());
        System.out.println(names);
    }
}
