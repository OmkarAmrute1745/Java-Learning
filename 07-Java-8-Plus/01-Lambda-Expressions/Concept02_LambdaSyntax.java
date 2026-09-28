package lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class Concept02_LambdaSyntax {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Rahul", "Amit");

        names.forEach(name -> System.out.println(name));

        names.forEach((name) -> System.out.println("Name: " + name));

        names.forEach(name -> {
            String message = "Welcome " + name;
            System.out.println(message);
        });
    }
}
