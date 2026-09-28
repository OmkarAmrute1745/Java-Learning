package functionalinterfaces;

@FunctionalInterface
interface Greeting {
    void greet(String name);
}

public class Concept01_FunctionalInterface {

    public static void main(String[] args) {
        Greeting greeting = name -> System.out.println("Hello, " + name);
        greeting.greet("Omkar");
    }
}