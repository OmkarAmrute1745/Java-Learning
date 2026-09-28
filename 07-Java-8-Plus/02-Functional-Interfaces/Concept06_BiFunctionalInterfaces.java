package functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Concept06_BiFunctionalInterfaces {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addition = (first, second) -> first + second;
        BiPredicate<String, Integer> hasLength = (text, length) -> text.length() == length;

        System.out.println("Addition: " + addition.apply(10, 20));
        System.out.println("Length matches: " + hasLength.test("Java", 4));
    }
}