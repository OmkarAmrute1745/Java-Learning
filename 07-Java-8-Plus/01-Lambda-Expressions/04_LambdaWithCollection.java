/*
 * JAVA 8+
 * AREA: Lambda Expressions
 * CONCEPT: Lambda With Collection
 *
 * What is it?
 * Lambdas can be passed directly to collection operations such as forEach().
 *
 * Why do we need it?
 * It makes collection processing concise and readable.
 *
 * Key points:
 * - Collection forEach() accepts a Consumer.
 * - Lambda contains the action for each element.
 * - It is commonly used in modern Java code.
 *
 * Interview note:
 * Explain how a lambda passed to forEach() is connected to Consumer<T>.
 */

import java.util.Arrays;
import java.util.List;

class Concept04_LambdaWithCollection {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        numbers.forEach(number -> {
            if (number > 25) {
                System.out.println(number);
            }
        });
    }
}