/*
 * JAVA 8+
 * AREA: Modern Functional Patterns
 * CONCEPT: Function Composition
 *
 * What is it?
 * Function composition combines smaller functions into a larger operation.
 *
 * Why do we need it?
 * It helps build reusable transformation logic.
 *
 * Key points:
 * - andThen() runs the first function and then the next.
 * - compose() runs the supplied function before the current function.
 *
 * Interview note:
 * Be able to trace the order of execution in compose() and andThen().
 */

import java.util.function.Function;

class Concept01_FunctionComposition {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyByTwo = number -> number * 2;
        Function<Integer, Integer> addTen = number -> number + 10;

        Function<Integer, Integer> pipeline =
                multiplyByTwo.andThen(addTen);

        System.out.println(pipeline.apply(5));
    }
}