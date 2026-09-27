/**
 * Topic: GenericMax
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static <T extends Comparable<T>> T max(java.util.List<T> values) {
    T maximum = values.get(0);
    for (T value : values) {
        if (value.compareTo(maximum) > 0) {
            maximum = value;
        }
    }
    return maximum;
}
class Concept03_GenericMax {

    public static void main(String[] args) {
        java.util.List<Integer> values = java.util.Arrays.asList(10, 50, 20);
        System.out.println(max(values));
    }
}
