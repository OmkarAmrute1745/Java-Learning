/*
 * JAVA OOP
 * AREA: Encapsulation
 * CONCEPT: Constructors
 *
 * What is it?
 * Constructors is an important Object-Oriented Programming concept in Java.
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

class Customer {
    int id;
    String name;
    Customer() {
        this(0,"Unknown");
    }
    Customer(int i,String n) {
        id=i;
        name=n;
    }
}
class Concept02_Constructors {
    public static void main(String[]args) {
        Customer c=new Customer(101,"Omkar");
        System.out.println(c.id+" "+c.name);
    }
}
