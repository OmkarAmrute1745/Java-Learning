package methodreferences;

import java.util.Arrays;
import java.util.List;

public class Concept05_MethodReferenceWithCollection {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Rahul", "Amit");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}