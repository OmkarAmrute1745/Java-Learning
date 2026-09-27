/**
 * Topic: 02 Equals
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
class Person {
    private final int id;

    Person(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Person other)) return false;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

public class 02Equals {

    public static void main(String[] args) {
        System.out.println(new Person(1).equals(new Person(1)));
    }
}
