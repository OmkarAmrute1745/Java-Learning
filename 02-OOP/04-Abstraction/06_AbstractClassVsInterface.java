/*
 * JAVA OOP
 * AREA: Abstraction
 * CONCEPT: Abstract Class vs Interface
 *
 * What is it?
 * Abstract Class vs Interface is an important Object-Oriented Programming concept in Java.
 *
 * Why do we need it?
 * It helps us understand how Java models objects, relationships, reusable behavior, and maintainable designs.
 *
 * Key points:
 * - Understand the concept before memorizing syntax.
 * - Run the example and change the values.
 * - Connect the example to a real-world object or relationship.
 *
 * Interview note:
 * Be able to explain this concept in simple words and give one practical example.
 */

abstract class Vehicle {
    protected String brand;
    Vehicle(String b) {
        brand=b;
    }
    abstract void move();
}
interface Electric {
    void charge();
}
class ElectricCar extends Vehicle implements Electric {
    ElectricCar(String b) {
        super(b);
    }
    void move() {
        System.out.println(brand+" moves");
    }
    public void charge() {
        System.out.println("Charging");
    }
}
class Concept06_AbstractClassVsInterface {
    public static void main(String[]args) {
        ElectricCar c=new ElectricCar("EV");
        c.move();
        c.charge();
    }
}
