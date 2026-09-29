/* JAVA MODERN JAVA
 * AREA: Java 14-17
 * CONCEPT: Records, sealed classes and pattern matching
 * What is it? Modern language features for concise data models and controlled type hierarchies.
 * Why do we need it? They reduce boilerplate and make domain models easier to reason about.
 * Key points: records provide data-carrier semantics; sealed types restrict implementations; instanceof can bind a variable.
 * Interview note: Know when a record is preferable to a mutable entity class.
 */
record User(int id,String name){}
sealed interface Shape permits Circle{}
final class Circle implements Shape{}
class Concept03_RecordsSealedPatternMatching{public static void main(String[]args){var u=new User(1,"Omkar");System.out.println(u);Object value="Java";if(value instanceof String s)System.out.println(s.toUpperCase());Shape shape=new Circle();System.out.println(shape.getClass().getSimpleName());}}