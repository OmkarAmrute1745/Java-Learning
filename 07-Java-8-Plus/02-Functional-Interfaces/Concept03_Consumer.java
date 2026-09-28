package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Concept03_Consumer {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Amit", "Sneha");

        Consumer<String> printer = name -> System.out.println("Name: " + name);

        names.forEach(printer);
    }
}