/*
 * JAVA MULTITHREADING
 * AREA: Locks And Conditions
 * CONCEPT: Lock practice
 *
 * What is it?
 * Lock practice applies explicit locking to shared state.
 *
 * Why do we need it?
 * It demonstrates controlled access to a resource shared by threads.
 *
 * Key points:
 * - Acquire before the critical section.
 * - Release in finally.
 * - Keep the locked section small.
 *
 * Interview note:
 * Explain why explicit locks need careful unlock handling.
 */

class Concept05_LockPractice {
    static int value;
    static final java.util.concurrent.locks.ReentrantLock LOCK =
            new java.util.concurrent.locks.ReentrantLock();

    static void increment() {
        LOCK.lock();
        try { value++; }
        finally { LOCK.unlock(); }
    }

    public static void main(String[] args) throws Exception {
        Thread a = new Thread(() -> { for (int i = 0; i < 10000; i++) increment(); });
        Thread b = new Thread(() -> { for (int i = 0; i < 10000; i++) increment(); });
        a.start(); b.start(); a.join(); b.join();
        System.out.println(value);
    }
}
