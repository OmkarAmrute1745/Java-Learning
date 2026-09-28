/**
 * Topic: MethodReferenceWithCollection
 *
 * Java 8 learning example.
 * Understand the concept, run the program, then modify it and practice.
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