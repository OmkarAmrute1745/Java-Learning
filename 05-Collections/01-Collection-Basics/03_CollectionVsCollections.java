/**
 * Topic: CollectionVsCollections
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_CollectionVsCollections {

    public static void main(String[] args) {
        java.util.List<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(30);
        numbers.add(10);
        java.util.Collections.sort(numbers);
        System.out.println(numbers);
    }
}
