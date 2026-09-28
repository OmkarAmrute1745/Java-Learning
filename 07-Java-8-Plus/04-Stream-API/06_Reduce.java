/*
 * JAVA 8+
 * AREA: Stream API
 * CONCEPT: reduce()
 *
 * What is it?
 * reduce() combines stream elements into one result.
 *
 * Why do we need it?
 * It is useful for totals, products, maximums, and other aggregation logic.
 *
 * Key points:
 * - reduce() is a terminal operation in common forms.
 * - It combines values using an accumulator.
 * - An identity value can be supplied.
 *
 * Interview note:
 * Explain the accumulator and identity value.
 */

import java.util.Arrays;
import java.util.List;

class Concept06_Reduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        int total = numbers.stream()
                .reduce(0, (sum, number) -> sum + number);

        System.out.println("Total: " + total);
    }
}