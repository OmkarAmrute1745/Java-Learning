/**
 * Topic: LambdaWithParameters
 *
 * Java 8 learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
@FunctionalInterface
interface Calculator {

    int calculate(int first, int second);
}

class Concept03_LambdaWithParameters {

    public static void main(String[] args) {
        Calculator addition = (first, second) -> first + second;
        Calculator multiplication = (first, second) -> first * second;

        System.out.println("Addition: " + addition.calculate(10, 5));
        System.out.println("Multiplication: " + multiplication.calculate(10, 5));
    }
}