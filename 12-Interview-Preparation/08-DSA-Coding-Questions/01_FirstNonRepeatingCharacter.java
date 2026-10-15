/*
 * JAVA INTERVIEW PREPARATION
 * AREA: DSA coding
 * CONCEPT: First non-repeating character
 *
 * What is it?
 * The task is to find the first character that occurs exactly once.
 *
 * Why do we need it?
 * Frequency counting plus a second traversal avoids nested loops.
 *
 * Key points:
 * - Time is O(n) and extra space is O(k) for the character set.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Explain why preserving input order matters when finding the first unique character.
 */

import java.util.LinkedHashMap;
class Concept01_FirstNonRepeatingCharacter {
    static Character find(String text) {
        var counts = new LinkedHashMap<Character, Integer>();
        for (char c : text.toCharArray()) counts.put(c, counts.getOrDefault(c, 0) + 1);
        for (var entry : counts.entrySet()) if (entry.getValue() == 1) return entry.getKey();
        return null;
    }
    public static void main(String[] args) {
        System.out.println(find("swiss"));
    }
}
