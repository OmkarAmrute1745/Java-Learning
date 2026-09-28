/*
 * JAVA 8+
 * AREA: Interface Enhancements
 * CONCEPT: Default Method Conflict
 *
 * What is it?
 * A class can face a conflict when two interfaces provide the same default method.
 *
 * Why do we need it?
 * Java requires the class to resolve the ambiguity explicitly.
 *
 * Key points:
 * - The class can override the conflicting method.
 * - InterfaceName.super.method() can call a specific default implementation.
 *
 * Interview note:
 * This is a common multiple-interface interview scenario.
 */

interface Printable {
    default void show() {
        System.out.println("Printable");
    }
}

interface Displayable {
    default void show() {
        System.out.println("Displayable");
    }
}

class Concept03_DefaultMethodConflict implements Printable, Displayable {
    @Override
    public void show() {
        Printable.super.show();
        Displayable.super.show();
    }

    public static void main(String[] args) {
        new Concept03_DefaultMethodConflict().show();
    }
}