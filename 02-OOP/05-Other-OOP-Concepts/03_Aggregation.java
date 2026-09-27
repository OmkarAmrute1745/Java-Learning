/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: Aggregation
 *
 * What is it?
 * Aggregation is an important Object-Oriented Programming concept in Java.
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
import java.util.*;class Teacher{String name;Teacher(String n){name=n;}}class Department{List<Teacher> teachers;Department(List<Teacher> t){teachers=t;}void show(){for(Teacher t:teachers)System.out.println(t.name);}} class Concept03_Aggregation{public static void main(String[]args){List<Teacher> t=new ArrayList<>();t.add(new Teacher("Amit"));t.add(new Teacher("Neha"));new Department(t).show();}}
