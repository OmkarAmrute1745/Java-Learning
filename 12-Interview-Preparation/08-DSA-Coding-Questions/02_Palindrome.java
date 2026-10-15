/*
 * JAVA INTERVIEW PREPARATION
 * AREA: DSA coding
 * CONCEPT: Palindrome check
 *
 * What is it?
 * A palindrome reads the same forward and backward.
 *
 * Why do we need it?
 * Two pointers compare matching characters without building a reversed copy.
 *
 * Key points:
 * - Time is O(n); auxiliary space is O(1) for this character-based version.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Clarify whether spaces, punctuation, and case should be ignored.
 */

class Concept02_Palindrome {
    static boolean isPalindrome(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) if (text.charAt(left++) != text.charAt(right--)) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("java"));
    }
}
