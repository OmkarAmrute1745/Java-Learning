package functionalinterfaces;

import java.util.function.Function;

public class Concept04_Function {

    public static void main(String[] args) {
        Function<String, Integer> length = value -> value.length();

        System.out.println(length.apply("Java"));
        System.out.println(length.apply("Spring Boot"));
    }
}