/**
 * Topic: UpperBound
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static double sum(java.util.List<? extends Number> values) {
    double total = 0;
    for (Number value : values) {
        total += value.doubleValue();
    }
    return total;
}
class Concept01_UpperBound {

    public static void main(String[] args) {
        java.util.List<Integer> values = java.util.Arrays.asList(10, 20, 30);
        System.out.println(sum(values));
    }
}
