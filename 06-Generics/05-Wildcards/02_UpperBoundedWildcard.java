/**
 * Topic: UpperBoundedWildcard
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static void printNumbers(java.util.List<? extends Number> values) {
    for (Number value : values) {
        System.out.println(value);
    }
}
class Concept02_UpperBoundedWildcard {

    public static void main(String[] args) {
        java.util.List<Integer> values = java.util.Arrays.asList(10, 20);
        printNumbers(values);
    }
}
