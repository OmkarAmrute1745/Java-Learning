package functionalinterfaces;

import java.util.function.Predicate;

public class Concept02_Predicate {

    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(15));
    }
}