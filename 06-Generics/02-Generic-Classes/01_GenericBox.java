/**
 * Topic: GenericBox
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Box<T> {
    private T value;
    void set(T value) { this.value = value; }
    T get() { return value; }
}
class Concept01_GenericBox {

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Java");
        System.out.println(box.get());
    }
}
