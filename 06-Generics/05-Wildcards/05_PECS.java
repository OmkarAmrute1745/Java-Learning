/**
 * Topic: PECS
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static void copy(java.util.List<? extends Number> source, java.util.List<? super Number> destination) {
    for (Number value : source) {
        destination.add(value);
    }
}
class Concept05_PECS {

    public static void main(String[] args) {
        java.util.List<Integer> source = java.util.Arrays.asList(10, 20);
        java.util.List<Number> destination = new java.util.ArrayList<>();
        copy(source, destination);
        System.out.println(destination);
    }
}
