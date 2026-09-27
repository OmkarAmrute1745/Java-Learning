/**
 * Topic: HashCode
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Person {
    private final int id;
    Person(int id) { this.id = id; }
    @Override public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Person other)) return false;
        return id == other.id;
    }
    @Override public int hashCode() { return Integer.hashCode(id); }
}

class Concept03_HashCode {

    public static void main(String[] args) {
        System.out.println(new Person(1).hashCode());
    }
}
