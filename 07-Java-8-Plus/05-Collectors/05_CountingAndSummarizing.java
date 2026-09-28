/*
 * JAVA 8+
 * AREA: Collectors
 * CONCEPT: Counting and Summarizing
 *
 * What is it?
 * Collectors provide aggregation helpers such as counting() and summarizingInt().
 *
 * Why do we need it?
 * They simplify common reporting calculations.
 *
 * Key points:
 * - counting() counts elements.
 * - summingInt() calculates a sum.
 * - averagingInt() calculates an average.
 * - summarizingInt() provides multiple statistics.
 *
 * Interview note:
 * Know which collector to choose for common aggregation requirements.
 */

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Concept05_CountingAndSummarizing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        long count = numbers.stream()
                .collect(Collectors.counting());

        int sum = numbers.stream()
                .collect(Collectors.summingInt(Integer::intValue));

        IntSummaryStatistics statistics = numbers.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + statistics.getAverage());
    }
}