/**
 * Topic: StaticMethodReference
 *
 * Java 8 learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
import java.util.function.Function;

class Concept01_StaticMethodReference {

    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> operation =
                Concept01_StaticMethodReference::square;

        System.out.println(operation.apply(5));
    }
}