/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: SOLID - Open/Closed
 *
 * What is it?
 * SOLID - Open/Closed is an important Object-Oriented Programming concept in Java.
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

interface Discount {
    double apply(double a);
}
class FestivalDiscount implements Discount {
    public double apply(double a) {
        return a*.9;
    }
}
class Checkout {
    double total(double a,Discount d) {
        return d.apply(a);
    }
}
class Concept14_SOLID_OCP {
    public static void main(String[]args) {
        System.out.println(new Checkout().total(1000,new FestivalDiscount()));
    }
}
