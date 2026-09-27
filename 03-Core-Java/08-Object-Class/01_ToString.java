/**
 * Topic: 01 ToString
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
class Person {
    private final String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

public class 01ToString {

    public static void main(String[] args) {
        Person person = new Person("Omkar");
        System.out.println(person);
    }
}
