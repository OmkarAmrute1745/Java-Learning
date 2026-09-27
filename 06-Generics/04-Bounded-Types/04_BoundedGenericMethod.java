/**
 * Topic: BoundedGenericMethod
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static <T extends Comparable<T>> T larger(T first, T second) {
    return first.compareTo(second) >= 0 ? first : second;
}
class Concept04_BoundedGenericMethod {

    public static void main(String[] args) {
        System.out.println(larger(10, 20));
    }
}
