/*
 * JAVA 8+
 * AREA: Lambda Expressions
 * CONCEPT: Lambda With Parameters
 *
 * What is it?
 * A lambda can receive parameters and return a calculated result.
 *
 * Why do we need it?
 * It allows behavior such as calculations to be passed as data.
 *
 * Key points:
 * - Parameter types can usually be inferred.
 * - A return expression can be written directly.
 * - The target functional interface defines the lambda signature.
 *
 * Interview note:
 * Be able to identify the parameter types and return type of a lambda.
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