package DSA.LeetCode_Daily;

/*
1295. Find Numbers with Even Number of Digits
Given an array nums of integers, return how many of them contain an even number of digits.
Example 1: Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.
*/

import java.util.Arrays;

public class _1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int count =0;
        for (int num :nums){
            char[] numArr = Integer.toString(num).toCharArray();
            if (numArr.length%2==0)
                count++;
        }
        return count;
    }
}
