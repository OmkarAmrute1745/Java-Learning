/**
 * Topic: Function
 *
 * Java 8 learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
import java.util.function.Function;

class Concept04_Function {

    public static void main(String[] args) {
        Function<String, Integer> length = value -> value.length();

        System.out.println(length.apply("Java"));
        System.out.println(length.apply("Spring Boot"));
    }
}