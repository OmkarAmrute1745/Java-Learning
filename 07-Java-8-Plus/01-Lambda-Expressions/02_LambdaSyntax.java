/*
 * JAVA 8+
 * AREA: Lambda Expressions
 * CONCEPT: Lambda Syntax
 *
 * What is it?
 * Lambda syntax represents parameters, an arrow, and the implementation body.
 *
 * Why do we need it?
 * It gives a concise way to write functional behavior.
 *
 * Key points:
 * - Parameters can use inferred types.
 * - Parentheses can be omitted for one parameter.
 * - Braces are used when multiple statements are required.
 *
 * Interview note:
 * Know the difference between expression-body and block-body lambdas.
 */

import java.util.Arrays;
import java.util.List;

class Concept02_LambdaSyntax {
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