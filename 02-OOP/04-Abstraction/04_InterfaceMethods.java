/*
 * JAVA OOP
 * AREA: Abstraction
 * CONCEPT: Interface Method Types
 *
 * What is it?
 * Interface Method Types is an important Object-Oriented Programming concept in Java.
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
interface Logger{void log(String s);default void info(String s){log("[INFO] "+s);}static String name(){return "Java Learning";}}class ConsoleLogger implements Logger{public void log(String s){System.out.println(s);}} class Concept04_InterfaceMethods{public static void main(String[]args){Logger l=new ConsoleLogger();l.info("Started");System.out.println(Logger.name());}}
