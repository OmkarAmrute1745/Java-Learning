/**
 * Topic: GenericMethod
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static <T> void printValue(T value) {
    System.out.println(value);
}
class Concept01_GenericMethod {

    public static void main(String[] args) {
        printValue("Java");
        printValue(100);
    }
}
