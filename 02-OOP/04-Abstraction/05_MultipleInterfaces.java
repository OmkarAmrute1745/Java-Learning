/*
 * JAVA OOP
 * AREA: Abstraction
 * CONCEPT: Multiple Interfaces
 *
 * What is it?
 * Multiple Interfaces is an important Object-Oriented Programming concept in Java.
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
interface Camera{void takePhoto();}interface MusicPlayer{void play();}class SmartPhone implements Camera,MusicPlayer{public void takePhoto(){System.out.println("Photo");}public void play(){System.out.println("Music");}} class Concept05_MultipleInterfaces{public static void main(String[]args){SmartPhone s=new SmartPhone();s.takePhoto();s.play();}}
