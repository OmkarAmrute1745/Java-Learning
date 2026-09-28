/*
 * JAVA 8+
 * AREA: Method References
 * CONCEPT: Instance Method Reference
 *
 * What is it?
 * An instance method reference points to a method of a particular object.
 *
 * Why do we need it?
 * It improves readability when an existing instance method matches the lambda.
 *
 * Key points:
 * - Syntax: object::instanceMethod.
 * - The referenced method is invoked through that object.
 *
 * Interview note:
 * Distinguish object::method from ClassName::staticMethod.
 */

import java.util.function.Function;

class Concept02_InstanceMethodReference {
    public static void main(String[] args) {
        String text = "java";
        Function<String, String> converter = text::toUpperCase;

        System.out.println(converter.apply(text));
    }
}