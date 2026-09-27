/**
 * Topic: HashSet
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_HashSet {

    public static void main(String[] args) {
        java.util.Set<Integer> numbers = new java.util.HashSet<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);
    }
}
