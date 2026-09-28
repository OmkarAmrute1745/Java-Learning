/*
 * JAVA MULTITHREADING
 * AREA: Locks And Conditions
 * CONCEPT: ReadWriteLock
 *
 * What is it?
 * ReadWriteLock is an important Java concurrency concept.
 *
 * Why do we need it?
 * It helps applications execute work concurrently and safely manage shared resources.
 *
 * Key points:
 * - Understand the concept before memorizing syntax.
 * - Run the example and change the values.
 * - Think about thread safety and shared state.
 *
 * Interview note:
 * Be able to explain the concept in simple words and give one practical backend example.
 */

class Concept03_ReadWriteLock { static class Store{final java.util.concurrent.locks.ReentrantReadWriteLock lock=new java.util.concurrent.locks.ReentrantReadWriteLock();String value="Java";void write(String v){lock.writeLock().lock();try{value=v;}finally{lock.writeLock().unlock();}}String read(){lock.readLock().lock();try{return value;}finally{lock.readLock().unlock();}}}public static void main(String[] args){Store s=new Store();s.write("Spring Boot");System.out.println(s.read());}}\n