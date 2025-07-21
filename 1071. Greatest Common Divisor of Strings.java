/**
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC" **/

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Step 1: Check if a common divisor string is possible
        if (!(str1 + str2).equals(str2 + str1)) {
            return ""; // no common pattern
        }

        // Step 2: Find GCD of lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Step 3: Return the substring of str1 from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Euclidean algorithm for GCD
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
