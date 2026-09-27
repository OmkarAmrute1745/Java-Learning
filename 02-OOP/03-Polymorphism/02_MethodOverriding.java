/*
 * JAVA OOP
 * AREA: Polymorphism
 * CONCEPT: Method Overriding
 *
 * What is it?
 * Method Overriding is an important Object-Oriented Programming concept in Java.
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

class Notification {
    void send() {
        System.out.println("Notification");
    }
}
class EmailNotification extends Notification {
    @Override void send() {
        System.out.println("Email");
    }
}
class Concept02_MethodOverriding {
    public static void main(String[]args) {
        Notification n=new EmailNotification();
        n.send();
    }
}
