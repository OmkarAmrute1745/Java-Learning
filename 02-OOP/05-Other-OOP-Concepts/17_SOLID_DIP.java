/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: SOLID - Dependency Inversion
 *
 * What is it?
 * SOLID - Dependency Inversion is an important Object-Oriented Programming concept in Java.
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
interface NotificationSender{void send(String m);}class EmailSender implements NotificationSender{public void send(String m){System.out.println("Email: "+m);}}class NotificationService{private final NotificationSender sender;NotificationService(NotificationSender s){sender=s;}void notifyUser(String m){sender.send(m);}} class Concept17_SOLID_DIP{public static void main(String[]args){new NotificationService(new EmailSender()).notifyUser("Welcome");}}
