/**
 * Topic: GenericVarargs
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
@SafeVarargs
static <T> void printAll(T... values) {
    for (T value : values) {
        System.out.println(value);
    }
}
class Concept05_GenericVarargs {

    public static void main(String[] args) {
        printAll("Java", "SQL", "Spring");
    }
}
