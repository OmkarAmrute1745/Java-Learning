/**
 * Topic: MarkerInterfaces
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
interface SerializableMarker {}
class Student implements SerializableMarker {}

class Concept03_MarkerInterfaces {

    public static void main(String[] args) {
        System.out.println(new Student() instanceof SerializableMarker);
    }
}
