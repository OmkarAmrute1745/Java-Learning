/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Collections
 * CONCEPT: HashMap basics
 *
 * What is it?
 * HashMap stores key-value mappings and uses hashing to locate entries.
 *
 * Why do we need it?
 * It is useful for fast average-time lookups and counting.
 *
 * Key points:
 * - Average get/put is O(1); collisions are handled internally; iteration order is not guaranteed.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Discuss null support, ordering, thread safety, and equals/hashCode.
 */

import java.util.HashMap;
class Concept01_HashMapBasics {
    public static void main(String[] args) {
        var counts = new HashMap<String, Integer>();
        counts.put("Java", 1);
        counts.put("Java", counts.get("Java") + 1);
        counts.put("Spring", 1);
        System.out.println(counts);
        System.out.println(counts.getOrDefault("SQL", 0));
    }
}
