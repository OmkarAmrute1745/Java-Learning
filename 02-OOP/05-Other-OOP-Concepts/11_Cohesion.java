/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: Cohesion
 *
 * What is it?
 * Cohesion is an important Object-Oriented Programming concept in Java.
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

class PaymentCalculator {
    double tax(double a) {
        return a*.18;
    }
    double total(double a) {
        return a+tax(a);
    }
}
class Concept11_Cohesion {
    public static void main(String[]args) {
        System.out.println(new PaymentCalculator().total(1000));
    }
}
