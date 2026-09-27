/**
 * Topic: SortAndReverse
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept02_SortAndReverse {

    public static void main(String[] args) {
        java.util.List<Integer> numbers = new java.util.ArrayList<>(java.util.Arrays.asList(10, 30, 20));
        java.util.Collections.sort(numbers);
        java.util.Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
