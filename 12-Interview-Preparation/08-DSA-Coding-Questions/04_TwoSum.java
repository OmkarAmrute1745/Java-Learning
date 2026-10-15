/*
 * JAVA INTERVIEW PREPARATION
 * AREA: DSA coding
 * CONCEPT: Two Sum
 *
 * What is it?
 * Find indices of two values whose sum equals a target.
 *
 * Why do we need it?
 * A hash map stores previously visited values and their indices.
 *
 * Key points:
 * - Average time is O(n) and space is O(n).
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Ask whether duplicate values are allowed and whether one or multiple pairs are expected.
 */

import java.util.HashMap;
import java.util.Arrays;
class Concept04_TwoSum {
    static int[] find(int[] values, int target) {
        var seen = new HashMap<Integer, Integer>();
        for (int i = 0; i < values.length; i++) {
            int needed = target - values[i];
            if (seen.containsKey(needed)) return new int[]{seen.get(needed), i};
            seen.put(values[i], i);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(new int[]{2, 7, 11, 15}, 9)));
    }
}
