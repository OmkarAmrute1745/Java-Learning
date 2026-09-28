/*
 * JAVA 8+
 * AREA: Collectors
 * CONCEPT: toList() and toSet()
 *
 * What is it?
 * Collectors provide reusable reduction operations for streams.
 *
 * Why do we need it?
 * They make it easy to convert stream results into collections.
 *
 * Key points:
 * - collect() is a terminal operation.
 * - toList() creates a List result.
 * - toSet() removes duplicate values.
 *
 * Interview note:
 * Know the difference between collect() and forEach().
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Concept01_ToListAndToSet {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Amit", "Omkar");

        List<String> list = names.stream()
                .collect(Collectors.toList());

        Set<String> set = names.stream()
                .collect(Collectors.toSet());

        System.out.println(list);
        System.out.println(set);
    }
}