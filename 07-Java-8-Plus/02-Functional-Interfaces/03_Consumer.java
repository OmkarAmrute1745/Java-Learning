/*
 * JAVA 8+
 * AREA: Functional Interfaces
 * CONCEPT: Consumer
 *
 * What is it?
 * Consumer<T> accepts a value and performs an action without returning a result.
 *
 * Why do we need it?
 * It is useful for printing, logging, updating, or processing values.
 *
 * Key points:
 * - Main method: accept(T).
 * - Return type is void.
 * - Collection.forEach() uses Consumer.
 *
 * Interview note:
 * Remember: Consumer consumes a value and does not return a value.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Concept03_Consumer {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Amit", "Sneha");
        Consumer<String> printer = name -> System.out.println("Name: " + name);

        names.forEach(printer);
    }
}