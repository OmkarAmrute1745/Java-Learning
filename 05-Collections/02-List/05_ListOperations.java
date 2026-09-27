/**
 * Topic: ListOperations
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_ListOperations {

    public static void main(String[] args) {
        java.util.List<Integer> numbers = new java.util.ArrayList<>(java.util.Arrays.asList(30, 10, 20));
        numbers.add(40);
        numbers.remove(Integer.valueOf(10));
        System.out.println(numbers.contains(20));
        System.out.println(numbers);
    }
}
