/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: IS-A vs HAS-A
 *
 * What is it?
 * IS-A vs HAS-A is an important Object-Oriented Programming concept in Java.
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
class Vehicle{void move(){System.out.println("Move");}}class Engine{void start(){System.out.println("Start");}}class Car extends Vehicle{private final Engine engine=new Engine();void start(){engine.start();}} class Concept08_ISAVsHASA{public static void main(String[]args){Car c=new Car();c.move();c.start();}}
