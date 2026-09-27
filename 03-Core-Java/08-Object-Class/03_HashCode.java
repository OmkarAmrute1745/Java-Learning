/**
 * Topic: 03 HashCode
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

public class 03HashCode {

    public static void main(String[] args) {
        System.out.println(new Person(1).hashCode());
    }
}
