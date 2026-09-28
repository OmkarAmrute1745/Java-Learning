package functionalinterfaces;

import java.util.function.Supplier;

public class Concept05_Supplier {

    public static void main(String[] args) {
        Supplier<String> message = () -> "Java 8 makes Java more functional.";

        System.out.println(message.get());
    }
}