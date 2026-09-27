/*
 * JAVA OOP
 * AREA: Encapsulation
 * CONCEPT: Getters and Setters
 *
 * What is it?
 * Getters and Setters is an important Object-Oriented Programming concept in Java.
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
class Employee{private double salary;public double getSalary(){return salary;}public void setSalary(double s){if(s>=0)salary=s;}} class Concept05_GettersAndSetters{public static void main(String[]args){Employee e=new Employee();e.setSalary(50000);System.out.println(e.getSalary());}}
