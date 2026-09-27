/**
 * Topic: DefaultMethods
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
interface Vehicle {
    void start();
    default void printType() { System.out.println("Vehicle"); }
}
class Car implements Vehicle {
    public void start() { System.out.println("Car started"); }
}

class Concept01_DefaultMethods {

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.printType();
    }
}
