/**
 * Topic: LambdaWithCollection
 *
 * Java 8 learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
import java.util.Arrays;
import java.util.List;

class Concept04_LambdaWithCollection {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        System.out.println("Numbers greater than 25:");

        numbers.forEach(number -> {
            if (number > 25) {
                System.out.println(number);
            }
        });
    }
}