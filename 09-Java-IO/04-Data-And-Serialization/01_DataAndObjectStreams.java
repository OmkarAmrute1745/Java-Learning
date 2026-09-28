/*
 * JAVA IO
 * AREA: Data And Serialization
 * CONCEPT: Data streams and object streams
 *
 * What is it?
 * Data streams and object streams is an important Java I/O concept.
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

class Concept04_DataAndObjectStreams { public static void main(String[] args) throws Exception { var b=new java.io.ByteArrayOutputStream();try(var out=new java.io.DataOutputStream(b)){out.writeInt(100);}try(var in=new java.io.DataInputStream(new java.io.ByteArrayInputStream(b.toByteArray()))){System.out.println(in.readInt());} } }
