/*
 * JAVA 8+
 * AREA: Stream API
 * CONCEPT: map()
 *
 * What is it?
 * map() transforms every stream element into another value.
 *
 * Why do we need it?
 * It is useful for converting data, such as names to uppercase or objects to fields.
 *
 * Key points:
 * - map() is an intermediate operation.
 * - One input element produces one output element.
 * - It can change the element type.
 *
 * Interview note:
 * map() transforms; filter() selects.
 */

import java.util.Arrays;
import java.util.List;

class Concept03_Map {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("omkar", "amit", "sneha");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}