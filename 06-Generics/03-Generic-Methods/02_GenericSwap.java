/**
 * Topic: GenericSwap
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static <T> void swap(java.util.List<T> values, int first, int second) {
    T temporary = values.get(first);
    values.set(first, values.get(second));
    values.set(second, temporary);
}
class Concept02_GenericSwap {

    public static void main(String[] args) {
        java.util.List<String> values = new java.util.ArrayList<>(java.util.Arrays.asList("A", "B"));
        swap(values, 0, 1);
        System.out.println(values);
    }
}
