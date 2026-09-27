/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: Object Class Methods
 *
 * What is it?
 * Object Class Methods is an important Object-Oriented Programming concept in Java.
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
import java.util.*;class Employee{int id;String name;Employee(int i,String n){id=i;name=n;}public String toString(){return id+"-"+name;}public boolean equals(Object o){if(this==o)return true;if(!(o instanceof Employee e))return false;return id==e.id&&Objects.equals(name,e.name);}public int hashCode(){return Objects.hash(id,name);}} class Concept07_ObjectClassMethods{public static void main(String[]args){Employee a=new Employee(1,"Omkar"),b=new Employee(1,"Omkar");System.out.println(a);System.out.println(a.equals(b));System.out.println(a.hashCode()==b.hashCode());}}
