/*
 * JAVA IO
 * AREA: Data And Serialization
 * CONCEPT: Serialization and deserialization
 *
 * What is it?
 * Serialization and deserialization is an important Java I/O concept.
 *
 * Why do we need it?
 * It helps Java applications read, write, process, and manage data efficiently.
 *
 * Key points:
 * - Understand the concept before memorizing syntax.
 * - Run the example and change the input.
 * - Connect it to a backend use case.
 *
 * Interview note:
 * Explain the concept simply and give one practical example.
 */

class Concept05_Serialization { public static void main(String[] args) throws Exception { var b=new java.io.ByteArrayOutputStream();try(var out=new java.io.ObjectOutputStream(b)){out.writeObject("Java Object");}try(var in=new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(b.toByteArray()))){System.out.println(in.readObject());} } }
