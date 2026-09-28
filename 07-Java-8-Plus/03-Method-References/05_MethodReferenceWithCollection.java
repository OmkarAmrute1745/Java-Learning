/*
 * JAVA 8+
 * AREA: Method References
 * CONCEPT: Method Reference With Collection
 *
 * What is it?
 * Method references can be combined with stream operations.
 *
 * Why do we need it?
 * It makes transformation pipelines shorter and easier to read.
 *
 * Key points:
 * - map() can use a method reference.
 * - forEach() can use a method reference.
 *
 * Interview note:
 * Understand both the lambda and method-reference version of the same pipeline.
 */

import java.util.Arrays;
import java.util.List;

class Concept05_MethodReferenceWithCollection {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Rahul", "Amit");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}