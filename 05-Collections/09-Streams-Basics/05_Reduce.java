/**
 * Topic: Reduce
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_Reduce {

    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(10, 20, 30);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
