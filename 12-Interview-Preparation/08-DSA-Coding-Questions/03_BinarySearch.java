/*
 * JAVA INTERVIEW PREPARATION
 * AREA: DSA coding
 * CONCEPT: Binary search
 *
 * What is it?
 * Binary search finds a target in a sorted array by repeatedly halving the search interval.
 *
 * Why do we need it?
 * It reduces search time compared with linear scanning for large sorted inputs.
 *
 * Key points:
 * - Time is O(log n); iterative extra space is O(1).
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * State clearly that the input must be sorted.
 */

class Concept03_BinarySearch {
    static int search(int[] values, int target) {
        int low = 0, high = values.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (values[mid] == target) return mid;
            if (values[mid] < target) low = mid + 1; else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{2, 4, 6, 8, 10}, 8));
    }
}
