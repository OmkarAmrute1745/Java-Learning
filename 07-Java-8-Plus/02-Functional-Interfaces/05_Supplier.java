/**
 * Topic: Supplier
 *
 * Java 8 learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
import java.util.function.Supplier;

class Concept05_Supplier {

    public static void main(String[] args) {
        Supplier<String> message = () -> "Java 8 makes Java more functional.";

        System.out.println(message.get());
    }
}