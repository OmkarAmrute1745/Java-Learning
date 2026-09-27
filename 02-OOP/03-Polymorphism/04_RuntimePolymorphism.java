/*
 * JAVA OOP
 * AREA: Polymorphism
 * CONCEPT: Runtime Polymorphism
 *
 * What is it?
 * Runtime Polymorphism is an important Object-Oriented Programming concept in Java.
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

class Payment {
    void pay() {
        System.out.println("Generic");
    }
}
class CardPayment extends Payment {
    @Override void pay() {
        System.out.println("Card");
    }
}
class UpiPayment extends Payment {
    @Override void pay() {
        System.out.println("UPI");
    }
}
class Concept04_RuntimePolymorphism {
    static void process(Payment p) {
        p.pay();
    }
    public static void main(String[]args) {
        process(new CardPayment());
        process(new UpiPayment());
    }
}
