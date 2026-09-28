package methodreferences;

import java.util.function.Function;

public class Concept02_InstanceMethodReference {

    public static void main(String[] args) {
        String text = "java";

        Function<String, String> converter = text::toUpperCase;

        System.out.println(converter.apply(text));
    }
}