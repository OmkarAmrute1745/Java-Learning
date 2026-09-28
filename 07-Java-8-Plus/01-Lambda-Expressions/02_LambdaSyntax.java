/**
 * Topic: LambdaSyntax
 *
 * Java 8 learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
import java.util.Arrays;
import java.util.List;

class Concept02_LambdaSyntax {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Rahul", "Amit");

        names.forEach(name -> System.out.println(name));

        names.forEach((name) -> System.out.println("Name: " + name));

        names.forEach(name -> {
            String message = "Welcome " + name;
            System.out.println(message);
        });
    }
}