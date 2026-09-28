/*
 * JAVA 8+
 * AREA: Collectors
 * CONCEPT: partitioningBy()
 *
 * What is it?
 * partitioningBy() divides elements into two groups based on a predicate.
 *
 * Why do we need it?
 * It is useful when the result naturally has true and false categories.
 *
 * Key points:
 * - The result is Map<Boolean, List<T>> in the basic form.
 * - The predicate decides the partition.
 *
 * Interview note:
 * Compare partitioningBy() with groupingBy().
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Concept04_PartitioningBy {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        Map<Boolean, List<Integer>> result = numbers.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));

        System.out.println(result);
    }
}