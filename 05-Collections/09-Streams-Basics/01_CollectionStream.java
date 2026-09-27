/**
 * Topic: CollectionStream
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_CollectionStream {

    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(1, 2, 3, 4);
        numbers.stream().forEach(System.out::println);
    }
}
