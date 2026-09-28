package methodreferences;

import java.util.Arrays;
import java.util.List;

public class Concept03_ObjectMethodReference {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Amit", "Sneha");

        names.forEach(System.out::println);
    }
}