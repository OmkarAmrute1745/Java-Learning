/*
 * JAVA INTERVIEW PREPARATION
 * AREA: OOP and SOLID
 * CONCEPT: Dependency inversion
 *
 * What is it?
 * High-level logic depends on abstractions rather than concrete implementation details.
 *
 * Why do we need it?
 * It makes code easier to test, replace, and extend.
 *
 * Key points:
 * - Constructor injection makes dependencies explicit.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Explain how dependency inversion helps unit testing and reduces tight coupling.
 */

interface MessageSender { void send(String message); }
class ConsoleMessageSender implements MessageSender {
    public void send(String message) { System.out.println(message); }
}
class NotificationService {
    private final MessageSender sender;
    NotificationService(MessageSender sender) { this.sender = sender; }
    void notifyUser(String message) { sender.send(message); }
}
class Concept03_DependencyInversion {
    public static void main(String[] args) {
        var service = new NotificationService(new ConsoleMessageSender());
        service.notifyUser("Payment processed");
    }
}
