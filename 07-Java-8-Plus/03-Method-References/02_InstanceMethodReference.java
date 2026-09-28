/**
 * Topic: InstanceMethodReference
 *
 * Java 8 learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
import java.util.function.Function;

class Concept02_InstanceMethodReference {

    public static void main(String[] args) {
        String text = "java";

        Function<String, String> converter = text::toUpperCase;

        System.out.println(converter.apply(text));
    }
}