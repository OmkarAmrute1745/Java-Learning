/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Core Java
 * CONCEPT: equals and hashCode contract
 *
 * What is it?
 * equals defines logical equality and hashCode provides a hash value used by hash-based collections.
 *
 * Why do we need it?
 * Consistent implementations allow HashMap and HashSet to locate equal objects correctly.
 *
 * Key points:
 * - Equal objects must have equal hash codes; unequal objects may share a hash code.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Explain why overriding only equals can break hash-based lookup.
 */

import java.util.HashSet;
import java.util.Objects;
class EmployeeKey {
    private final int id;
    EmployeeKey(int id) { this.id = id; }
    @Override public boolean equals(Object other) {
        return other instanceof EmployeeKey key && id == key.id;
    }
    @Override public int hashCode() { return Objects.hash(id); }
}
class Concept04_EqualsAndHashCode {
    public static void main(String[] args) {
        var ids = new HashSet<EmployeeKey>();
        ids.add(new EmployeeKey(7));
        System.out.println(ids.contains(new EmployeeKey(7)));
    }
}
