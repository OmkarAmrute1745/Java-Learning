/**
 * Topic: Filter
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept02_Filter {

    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }
}
