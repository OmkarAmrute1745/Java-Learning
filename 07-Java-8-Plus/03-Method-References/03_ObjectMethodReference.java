/*
 * JAVA 8+
 * AREA: Method References
 * CONCEPT: Object Method Reference
 *
 * What is it?
 * An object method reference can refer to an instance method such as println().
 *
 * Why do we need it?
 * It removes unnecessary lambda syntax when the method already exists.
 *
 * Key points:
 * - System.out::println is a common example.
 * - It is frequently used with collections and streams.
 *
 * Interview note:
 * Be able to convert name -> System.out.println(name) into System.out::println.
 */

import java.util.Arrays;
import java.util.List;

class Concept03_ObjectMethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Amit", "Sneha");

        names.forEach(System.out::println);
    }
}