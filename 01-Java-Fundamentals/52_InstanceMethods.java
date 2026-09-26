/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Instance Methods
 *
 * What is it?
 * An instance method belongs to an object and can work with that object's instance data.
 *
 * Why do we need it?
 * You need an object to call an instance method.
 *
 * Simple real-world example:
 * This is the normal style for object-oriented business behavior.
 *
 * Important syntax / idea:
 * Instance methods can access instance fields directly.
 *
 * Key points:
 * - Understand the concept before memorizing syntax.
 * - Run the example and change the values to see what happens.
 * - Read the comments in the code; they explain the important parts.
 *
 * Interview note:
 * Be able to explain this concept in simple words and give one
 * practical example. Also understand the difference between similar
 * concepts where applicable.
 *
 * Example output:
 * The exact output depends on the values used in the program.
 */
class Concept52_InstanceMethods {
    String name;

    Concept52_InstanceMethods(String name) {
        this.name = name;
    }

    void greet() {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Concept52_InstanceMethods user =
                new Concept52_InstanceMethods("Omkar");

        user.greet();
    }
}
