/*
 * JAVA MULTITHREADING
 * AREA: Locks And Conditions
 * CONCEPT: ReadWriteLock
 *
 * What is it?
 * ReadWriteLock separates read and write access to shared data.
 *
 * Why do we need it?
 * It can allow multiple readers while keeping writes exclusive.
 *
 * Key points:
 * - Read locks can be shared.
 * - Write locks are exclusive.
 * - Always unlock in finally.
 *
 * Interview note:
 * Explain when ReadWriteLock can be useful compared with synchronized.
 */

class Concept03_ReadWriteLock {
    static class Store {
        final java.util.concurrent.locks.ReentrantReadWriteLock lock =
                new java.util.concurrent.locks.ReentrantReadWriteLock();
        String value = "Java";

        void write(String v) {
            lock.writeLock().lock();
            try { value = v; }
            finally { lock.writeLock().unlock(); }
        }

        String read() {
            lock.readLock().lock();
            try { return value; }
            finally { lock.readLock().unlock(); }
        }
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.write("Spring Boot");
        System.out.println(store.read());
    }
}
