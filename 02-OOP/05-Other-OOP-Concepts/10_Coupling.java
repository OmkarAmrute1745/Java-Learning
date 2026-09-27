/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: Coupling
 *
 * What is it?
 * Coupling is an important Object-Oriented Programming concept in Java.
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

interface PaymentGateway {
    void pay(double amount);
}
class CardGateway implements PaymentGateway {
    public void pay(double a) {
        System.out.println("Card "+a);
    }
}
class PaymentService {
    private final PaymentGateway gateway;
    PaymentService(PaymentGateway g) {
        gateway=g;
    }
    void process(double a) {
        gateway.pay(a);
    }
}
class Concept10_Coupling {
    public static void main(String[]args) {
        new PaymentService(new CardGateway()).process(1000);
    }
}
