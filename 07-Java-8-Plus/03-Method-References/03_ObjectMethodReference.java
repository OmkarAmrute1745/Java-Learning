/**
 * Topic: ObjectMethodReference
 *
 * Java 8 learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
import java.util.Arrays;
import java.util.List;

class Concept03_ObjectMethodReference {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Amit", "Sneha");

        names.forEach(System.out::println);
    }
}