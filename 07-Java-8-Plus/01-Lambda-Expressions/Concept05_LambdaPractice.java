package lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class Concept05_LambdaPractice {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Amit", "Sneha", "Raj");

        System.out.println("Names with length greater than 4:");

        names.forEach(name -> {
            if (name.length() > 4) {
                System.out.println(name);
            }
        });
    }
}
