/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Collections
 * CONCEPT: Fail-fast iterator
 *
 * What is it?
 * Many collection iterators detect structural modification outside the iterator during iteration.
 *
 * Why do we need it?
 * It helps expose unsafe modification patterns rather than silently continuing.
 *
 * Key points:
 * - Use Iterator.remove or collection methods such as removeIf when suitable.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Fail-fast behavior is best-effort and must not be treated as a concurrency guarantee.
 */

import java.util.ArrayList;
class Concept03_FailFastIterator {
    public static void main(String[] args) {
        var numbers = new ArrayList<>(java.util.List.of(1, 2, 3, 4));
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println(numbers);
    }
}
