/*
 * JAVA 8+
 * AREA: Lambda Expressions
 * CONCEPT: Lambda Practice
 *
 * What is it?
 * Practice uses lambdas to express simple collection-processing rules.
 *
 * Why do we need it?
 * Repetition is important for becoming comfortable with functional syntax.
 *
 * Key points:
 * - Read the lambda from left to right.
 * - Identify the input and the action.
 * - Try changing the condition.
 *
 * Interview note:
 * Practice writing small lambdas without referring to examples.
 */

import java.util.Arrays;
import java.util.List;

class Concept05_LambdaPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Amit", "Sneha", "Raj");

        names.forEach(name -> {
            if (name.length() > 4) {
                System.out.println(name);
            }
        });
    }
}