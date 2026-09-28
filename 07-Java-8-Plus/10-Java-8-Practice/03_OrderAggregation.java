/*
 * JAVA 8+
 * AREA: Java 8 Practice
 * CONCEPT: Order Aggregation
 *
 * What is it?
 * This practice calculates a total using reduce().
 *
 * Why do we need it?
 * Aggregation is common in orders, payments, and reporting.
 *
 * Key points:
 * - reduce() combines multiple values.
 * - The identity value provides the initial total.
 *
 * Interview note:
 * Be able to explain how the accumulator calculates the final result.
 */

import java.util.Arrays;
import java.util.List;

class Concept03_OrderAggregation {
    public static void main(String[] args) {
        List<Double> orderAmounts = Arrays.asList(
                1200.50, 800.00, 450.75
        );

        double total = orderAmounts.stream()
                .reduce(0.0, (sum, amount) -> sum + amount);

        System.out.println("Order total: " + total);
    }
}