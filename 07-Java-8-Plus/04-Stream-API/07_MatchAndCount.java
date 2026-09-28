/*
 * JAVA 8+
 * AREA: Stream API
 * CONCEPT: Match Operations and count()
 *
 * What is it?
 * Stream matching operations test whether elements satisfy conditions.
 *
 * Why do we need it?
 * They simplify validation and existence checks.
 *
 * Key points:
 * - anyMatch() checks whether at least one element matches.
 * - allMatch() checks whether every element matches.
 * - noneMatch() checks whether no element matches.
 * - count() counts elements.
 *
 * Interview note:
 * Match operations are terminal operations.
 */

import java.util.Arrays;
import java.util.List;

class Concept07_MatchAndCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        System.out.println(numbers.stream().anyMatch(number -> number > 35));
        System.out.println(numbers.stream().allMatch(number -> number > 0));
        System.out.println(numbers.stream().noneMatch(number -> number < 0));
        System.out.println("Count: " + numbers.stream().count());
    }
}