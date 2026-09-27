/**
 * Topic: ToString
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Person {
    private final String name;
    Person(String name) { this.name = name; }
    @Override public String toString() { return "Person{name='" + name + "'}"; }
}

class Concept01_ToString {

    public static void main(String[] args) {
        System.out.println(new Person("Omkar"));
    }
}
