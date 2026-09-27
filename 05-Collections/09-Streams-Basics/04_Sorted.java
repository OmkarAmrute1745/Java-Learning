/**
 * Topic: Sorted
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_Sorted {

    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(30, 10, 20);
        numbers.stream().sorted().forEach(System.out::println);
    }
}
