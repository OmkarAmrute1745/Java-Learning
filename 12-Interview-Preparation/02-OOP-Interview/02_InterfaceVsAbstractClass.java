/*
 * JAVA INTERVIEW PREPARATION
 * AREA: OOP
 * CONCEPT: Interface versus abstract class
 *
 * What is it?
 * An interface defines a contract; an abstract class can combine abstract behavior with shared state and implementation.
 *
 * Why do we need it?
 * The choice shapes extensibility and how classes share behavior.
 *
 * Key points:
 * - A class can implement multiple interfaces but extend only one class.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Use an interface for a capability/contract and an abstract class for shared base behavior when appropriate.
 */

interface Payable { double amount(); }
abstract class Payment {
    private final String reference;
    Payment(String reference) { this.reference = reference; }
    String reference() { return reference; }
}
class CardPayment extends Payment implements Payable {
    private final double value;
    CardPayment(String reference, double value) { super(reference); this.value = value; }
    public double amount() { return value; }
}
class Concept02_InterfaceVsAbstractClass {
    public static void main(String[] args) {
        Payable payment = new CardPayment("TX-101", 1250.0);
        System.out.println(payment.amount());
    }
}
