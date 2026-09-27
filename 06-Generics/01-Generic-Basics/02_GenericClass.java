/**
 * Topic: GenericClass
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Box<T> {
    private T value;
    Box(T value) { this.value = value; }
    T getValue() { return value; }
}
class Concept02_GenericClass {

    public static void main(String[] args) {
        Box<Integer> box = new Box<>(100);
        System.out.println(box.getValue());
    }
}
