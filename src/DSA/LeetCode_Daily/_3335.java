package DSA.LeetCode_Daily;
/*
Total Characters in String After Transformations I
Medium
Topics
Companies
Hint
You are given a string s and an integer t, representing the number of transformations to perform. In one transformation, every character in s is replaced according to the following rules:

If the character is 'z', replace it with the string "ab".
Otherwise, replace it with the next character in the alphabet. For example, 'a' is replaced with 'b', 'b' is replaced with 'c', and so on.
Return the length of the resulting string after exactly t transformations.

Since the answer may be very large, return it modulo 109 + 7.



Example 1:

Input: s = "abcyy", t = 2

Output: 7

Explanation:

First Transformation (t = 1):
'a' becomes 'b'
'b' becomes 'c'
'c' becomes 'd'
'y' becomes 'z'
'y' becomes 'z'
String after the first transformation: "bcdzz"
Second Transformation (t = 2):
'b' becomes 'c'
'c' becomes 'd'
'd' becomes 'e'
'z' becomes "ab"
'z' becomes "ab"
String after the second transformation: "cdeabab"
Final Length of the string: The string is "cdeabab", which has 7 characters.
 */

public class _3335 {
    public static void main(String[] args) {
        String s= "abcyy";
        int t = 2;
        System.out.println(lengthAfterTransformations(s,t));
    }

    private static int lengthAfterTransformations(String s, int t) {
        final int MOD = 1_000_000_007;
        long[] count = new long[26];

        // Step 1: Initialize frequency of characters in s
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Step 2: Perform t transformations
        for (int time = 0; time < t; time++) {
            long[] newCount = new long[26];

            for (int i = 0; i < 26; i++) {
                if (i == 25) {
                    // 'z' → "ab"
                    newCount[0] = (newCount[0] + count[i]) % MOD;
                    newCount[1] = (newCount[1] + count[i]) % MOD;
                } else {
                    // c → c+1
                    newCount[i + 1] = (newCount[i + 1] + count[i]) % MOD;
                }
            }

            count = newCount;
        }

        // Step 3: Sum up the final counts
        long result = 0;
        for (long val : count) {
            result = (result + val) % MOD;
        }

        return (int) result;
    }
}
