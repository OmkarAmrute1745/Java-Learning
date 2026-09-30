/*
 * JAVA DSA
 * AREA: 01 DSA Basics
 * CONCEPT: String processing
 *
 * What is it?
 * String algorithms work with sequences of characters.
 *
 * Why do we need it?
 * Many interview problems are based on searching, counting, and transforming text.
 *
 * Key points:
 * - Use StringBuilder when repeated mutation is required.
 * - Understand the time and space complexity.
 * - Run the example and change the input.
 *
 * Interview note:
 * Explain String immutability and choose StringBuilder for repeated concatenation.
 */

class Concept03_Strings{public static void main(String[]args){String text="java";int vowels=0;for(char c:text.toCharArray())if("aeiou".indexOf(c)>=0)vowels++;System.out.println("Vowels: "+vowels);StringBuilder sb=new StringBuilder(text);System.out.println(sb.reverse());}}
