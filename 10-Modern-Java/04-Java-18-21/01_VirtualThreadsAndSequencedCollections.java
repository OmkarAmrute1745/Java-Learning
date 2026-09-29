/* JAVA MODERN JAVA
 * AREA: Java 18-21
 * CONCEPT: Virtual threads and sequenced collections
 * What is it? Java 21 features for lightweight concurrency and ordered collection access.
 * Why do we need it? Virtual threads simplify high-concurrency I/O workloads; sequenced collections provide first/last access consistently.
 * Key points: virtual threads are lightweight; getFirst/getLast express sequence operations clearly.
 * Interview note: Explain why virtual threads are useful for I/O-bound workloads.
 */
class Concept04_VirtualThreadsAndSequencedCollections{public static void main(String[]args)throws Exception{Thread t=Thread.startVirtualThread(()->System.out.println("Virtual thread"));t.join();var list=new java.util.ArrayList<>(java.util.List.of("A","B","C"));System.out.println(list.getFirst());System.out.println(list.getLast());}}