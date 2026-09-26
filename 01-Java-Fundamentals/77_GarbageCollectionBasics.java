/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Garbage Collection Basics
 *
 * What is it?
 * Garbage collection is the JVM process of automatically reclaiming heap memory from objects that are no longer reachable.
 *
 * Why do we need it?
 * Java developers normally do not manually free objects like in C or C++.
 *
 * Simple real-world example:
 * An object becomes eligible for garbage collection when no live reference can reach it.
 *
 * Important syntax / idea:
 * Calling System.gc() is only a request to the JVM; it does not guarantee immediate collection.
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
class Concept77_GarbageCollectionBasics {
    static class User {
        String name;

        User(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        User user = new User("Omkar");

        // The object is reachable through user.
        System.out.println(user.name);

        user = null;

        // The User object is now eligible for garbage collection
        // because no reference points to it.
        System.out.println("Object is no longer referenced.");
    }
}
