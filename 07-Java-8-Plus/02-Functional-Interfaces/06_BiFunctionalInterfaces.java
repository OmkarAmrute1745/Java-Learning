/**
 * Topic: BiFunctionalInterfaces
 *
 * Java 8 learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

class Concept06_BiFunctionalInterfaces {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addition =
                (first, second) -> first + second;

        BiPredicate<String, Integer> hasLength =
                (text, length) -> text.length() == length;

        System.out.println("Addition: " + addition.apply(10, 20));
        System.out.println("Length matches: " + hasLength.test("Java", 4));
    }
}