/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Pass by Value
 *
 * What is it?
 * Java is always pass-by-value. A method receives a copy of the argument value.
 *
 * Why do we need it?
 * For primitives, the copied value is the primitive itself. For objects, the copied value is the reference value, so both references can point to the same object.
 *
 * Simple real-world example:
 * Because the reference is copied, a method can mutate the same object, but reassigning the parameter does not change the caller's reference.
 *
 * Important syntax / idea:
 * This is a common Java interview topic.
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
class Concept76_PassByValue {
    static class User {
        String name;
        User(String name) {
            this.name = name;
        }
    }

    static void changeNumber(int number) {
        number = 100;
    }

    static void changeName(User user) {
        user.name = "Changed";
    }

    static void reassignUser(User user) {
        user = new User("New Object");
    }

    public static void main(String[] args) {
        int number = 10;
        changeNumber(number);

        User user = new User("Omkar");
        changeName(user);
        reassignUser(user);

        System.out.println("Number: " + number);
        System.out.println("User name: " + user.name);
    }
}
