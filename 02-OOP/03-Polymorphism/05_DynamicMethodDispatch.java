/*
 * JAVA OOP
 * AREA: Polymorphism
 * CONCEPT: Dynamic Method Dispatch
 *
 * What is it?
 * Dynamic Method Dispatch is an important Object-Oriented Programming concept in Java.
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
class Shape{void draw(){System.out.println("Shape");}}class Circle extends Shape{@Override void draw(){System.out.println("Circle");}}class Rectangle extends Shape{@Override void draw(){System.out.println("Rectangle");}} class Concept05_DynamicMethodDispatch{public static void main(String[]args){Shape s=new Circle();s.draw();s=new Rectangle();s.draw();}}
