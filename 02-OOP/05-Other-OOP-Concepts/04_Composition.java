/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: Composition
 *
 * What is it?
 * Composition is an important Object-Oriented Programming concept in Java.
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
class Engine{void start(){System.out.println("Engine");}}class Car{private final Engine engine=new Engine();void start(){engine.start();System.out.println("Car");}} class Concept04_Composition{public static void main(String[]args){new Car().start();}}
