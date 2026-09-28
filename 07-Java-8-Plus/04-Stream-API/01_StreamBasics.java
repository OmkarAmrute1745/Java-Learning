/*
 * JAVA 8+
 * AREA: Stream API
 * CONCEPT: Stream Basics
 *
 * What is it?
 * A Stream is a sequence of elements that supports functional-style processing.
 *
 * Why do we need it?
 * It helps process collections through readable operation pipelines.
 *
 * Key points:
 * - A stream does not store data.
 * - Streams do not normally change the source collection.
 * - Operations are chained into a pipeline.
 *
 * Interview note:
 * Know the difference between a Collection and a Stream.
 */

import java.util.Arrays;
import java.util.List;

class Concept01_StreamBasics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        numbers.stream()
                .forEach(System.out::println);
    }
}