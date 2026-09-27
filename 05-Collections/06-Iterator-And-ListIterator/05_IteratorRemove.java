/**
 * Topic: IteratorRemove
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_IteratorRemove {

    public static void main(String[] args) {
        java.util.List<Integer> numbers = new java.util.ArrayList<>(java.util.Arrays.asList(10, 20, 30));
        java.util.Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 20) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
