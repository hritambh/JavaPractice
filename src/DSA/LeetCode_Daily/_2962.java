package DSA.LeetCode_Daily;

//You are given an integer array nums and a positive integer k.
//
//Return the number of subarrays where the maximum element of nums appears at least k times in that subarray.
//
//A subarray is a contiguous sequence of elements within an array.
//
//
//
//        Example 1:
//
//Input: nums = [1,3,2,3,3], k = 2
//Output: 6
//Explanation: The subarrays that contain the element 3 at least 2 times are: [1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].
//Example 2:
//
//Input: nums = [1,4,2,1], k = 3
//Output: 0
//Explanation: No subarray contains the element 4 at least 3 times.

import java.util.Arrays;

public class _2962 {
    public static long countSubArraysWithMax(int[] nums, int k) {
        int n = nums.length;
        long count = 0;
        int max = 0;
        for(int num : nums) {
            max = Math.max(max, num);
        }
        int left = 0;
        int a = 0;
        for(int right = 0; right < n; right++) {
            if(nums[right] == max) a++;
            while(a >= k) {
                count += (n - right);
                if(nums[left] == max) a--;
                left++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,3};
        int k =2;
        System.out.println(countSubArraysWithMax(nums,k));

    }
}
