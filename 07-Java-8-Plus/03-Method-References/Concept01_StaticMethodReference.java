package methodreferences;

import java.util.function.Function;

public class Concept01_StaticMethodReference {

    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> operation = Concept01_StaticMethodReference::square;

        System.out.println(operation.apply(5));
    }
}