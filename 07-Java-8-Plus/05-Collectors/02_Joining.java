/*
 * JAVA 8+
 * AREA: Collectors
 * CONCEPT: joining()
 *
 * What is it?
 * Collectors.joining() combines stream strings into one String.
 *
 * Why do we need it?
 * It is useful for creating comma-separated or formatted text.
 *
 * Key points:
 * - joining() works with String elements.
 * - A delimiter can be supplied.
 * - Prefix and suffix can also be supplied.
 *
 * Interview note:
 * Know how joining() differs from String concatenation in a loop.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Concept02_Joining {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Amit", "Sneha");

        String result = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}