/**
 * Topic: HashSetVsLinkedHashSetVsTreeSet
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_HashSetVsLinkedHashSetVsTreeSet {

    public static void main(String[] args) {
        java.util.Set<Integer> hash = new java.util.HashSet<>(java.util.Arrays.asList(3, 1, 2));
        java.util.Set<Integer> linked = new java.util.LinkedHashSet<>(java.util.Arrays.asList(3, 1, 2));
        java.util.Set<Integer> tree = new java.util.TreeSet<>(java.util.Arrays.asList(3, 1, 2));
        System.out.println(hash);
        System.out.println(linked);
        System.out.println(tree);
    }
}
