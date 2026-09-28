/*
 * JAVA 8+
 * AREA: Functional Interfaces
 * CONCEPT: Supplier
 *
 * What is it?
 * Supplier<T> provides a value without receiving an input.
 *
 * Why do we need it?
 * It is useful for lazy value creation and factories.
 *
 * Key points:
 * - Main method: get().
 * - It accepts no argument.
 * - It returns a value.
 *
 * Interview note:
 * Remember: Supplier supplies a value and takes no input.
 */

import java.util.function.Supplier;

class Concept05_Supplier {
    public static void main(String[] args) {
        Supplier<String> message = () -> "Java 8 makes Java more functional.";

        System.out.println(message.get());
    }
}