/* JAVA MODERN JAVA
 * AREA: Modern Java Practice
 * CONCEPT: Modern backend practice
 * What is it? A small example combining records, pattern matching, switch expressions and virtual threads.
 * Why do we need it? Backend code benefits from concise models and scalable concurrent tasks.
 * Key points: combine features only when they improve clarity.
 * Interview note: Explain each feature separately before explaining the combined solution.
 */
record Customer(int id,String name){}
class Concept05_ModernBackendPractice{public static void main(String[]args)throws Exception{var c=new Customer(1,"Omkar");Object value=c;String result=switch(value){case Customer x->"Customer: "+x.name();default->"Unknown";};System.out.println(result);Thread t=Thread.startVirtualThread(()->System.out.println("Async customer task"));t.join();}}