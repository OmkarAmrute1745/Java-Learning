/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Java 8
 * CONCEPT: Stream API
 *
 * What is it?
 * A stream describes a sequence of operations over data rather than storing data itself.
 *
 * Why do we need it?
 * It can make filtering and transformation pipelines easier to read.
 *
 * Key points:
 * - Intermediate operations are lazy; terminal operations trigger processing.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Choose streams for clear data transformations, not automatically for every loop.
 */

import java.util.List;
class Concept01_StreamVsLoop {
    public static void main(String[] args) {
        List<Integer> values = List.of(1, 2, 3, 4, 5, 6);
        var result = values.stream().filter(n -> n % 2 == 0).map(n -> n * n).toList();
        System.out.println(result);
    }
}
