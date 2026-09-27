/**
 * Topic: GenericArrayDisplay
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static <T> void display(T[] values) {
    for (T value : values) {
        System.out.println(value);
    }
}
class Concept04_GenericArrayDisplay {

    public static void main(String[] args) {
        Integer[] values = {10, 20, 30};
        display(values);
    }
}
