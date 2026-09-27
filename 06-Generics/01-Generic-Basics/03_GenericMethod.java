/**
 * Topic: GenericMethod
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static <T> T identity(T value) {
    return value;
}
class Concept03_GenericMethod {

    public static void main(String[] args) {
        System.out.println(identity("Java"));
        System.out.println(identity(100));
    }
}
