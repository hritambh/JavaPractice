package DSA.LeetCode_Daily;

//2799. Count Complete Subarrays in an Array
//Medium
//        Topics
//Companies
//        Hint
//You are given an array nums consisting of positive integers.
//
//We call a subarray of an array complete if the following condition is satisfied:
//
//The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array.
//Return the number of complete subarrays.
//
//A subarray is a contiguous non-empty part of an array.
//
//
//
//        Example 1:
//
//Input: nums = [1,3,1,2,2]
//Output: 4
//Explanation: The complete subarrays are the following: [1,3,1,2], [1,3,1,2,2], [3,1,2] and [3,1,2,2].
//Example 2:
//
//Input: nums = [5,5,5,5]
//Output: 10
//Explanation: The array consists only of the integer 5, so any subarray is complete. The number of subarrays that we can choose is 10.


import java.util.HashSet;
import java.util.Set;

public class _2799 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,3,2,3};
        System.out.println(countUniqueSubArrays(nums));
    }

    private static int countUniqueSubArrays(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int num: nums)
            unique.add(num);
        int c = unique.size();
//        System.out.println("Size of nums :: "+nums.length);
        int count = 0;

        int l =0;
        int r = 0+c-1;

        for (int i = 0; i < nums.length-c+1; i++) {
            for (int j = i+c-1; j < nums.length ; j++) {
                boolean isComp = checkIfComplete(i,j,nums,unique);
             if(isComp){
                 count = count + (nums.length-c-i);
                 break;
             }


            }
        }


        return count;
    }

    private static boolean checkIfComplete(int i, int j, int[] nums, Set<Integer> unique) {
        Set<Integer> temp = new HashSet<>();
        System.out.println( i +" and "+j);
        for (int k = i; k <=j ; k++) {
            temp.add(nums[k]);
        }
        return temp.size()==unique.size();
    }
}
