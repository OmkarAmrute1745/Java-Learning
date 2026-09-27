/**
 * Topic: MultipleBounds
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static <T extends CharSequence & Comparable<T>> int compare(T first, T second) {
    return first.compareTo(second);
}
class Concept02_MultipleBounds {

    public static void main(String[] args) {
        System.out.println(compare("Java", "SQL"));
    }
}
