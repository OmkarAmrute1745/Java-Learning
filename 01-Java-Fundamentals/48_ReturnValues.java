/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Return Values
 *
 * What is it?
 * A method can return a calculated or processed value to its caller.
 *
 * Why do we need it?
 * Return values let methods behave like reusable calculations.
 *
 * Simple real-world example:
 * For example, a method can calculate an order total and return it to the service layer.
 *
 * Important syntax / idea:
 * The returned type must match the method's declared return type.
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
class Concept48_ReturnValues {
    static double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        double total = calculateTotal(99.50, 3);
        System.out.println("Total: " + total);
    }
}
