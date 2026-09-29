/* JAVA MODERN JAVA
 * AREA: Java 9-11
 * CONCEPT: var and private interface methods
 * What is it? Modern Java features that reduce boilerplate and improve interface design.
 * Why do we need it? They make local code concise while keeping behavior encapsulated.
 * Key points: var is for local variables; private interface methods support reusable default-method logic.
 * Interview note: Know where var can and cannot be used.
 */
interface Calculator{default int add(int a,int b){return validate(a,b);}private int validate(int value,int other){return value+other;}}
class Concept01_VarAndPrivateInterfaceMethods{public static void main(String[]args){var message="Modern Java";System.out.println(message);System.out.println(new Calculator(){}.add(2,3));}}