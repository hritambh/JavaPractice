package DSA.LeetCode_Daily;

//1399. Count Largest Group
//        Easy
//Topics
//        Companies
//Hint
//You are given an integer n.
//
//Each number from 1 to n is grouped according to the sum of its digits.
//
//Return the number of groups that have the largest size.
//
//
//
//Example 1:
//
//Input: n = 13
//Output: 4
//Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
//        [1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9].
//There are 4 groups with largest size.

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class _1399 {
    public static void main(String[] args) {
        System.out.println(countLargetGroup(243));
    }

    private static int countLargetGroup(int n) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int sum =0;
            int temp = i;
            while (temp>0){
                sum+= temp%10;
                temp = temp/10;
                System.out.println(i);
            }
            freq.computeIfPresent(sum,(k,v)-> v+1);
//            System.out.println(freq.keySet() + ":::::::" + freq.values());
            freq.computeIfAbsent(sum,(k)-> 1);
//            System.out.println(freq.keySet() + "+++++++" + freq.values());

        }
            System.out.println(freq.keySet() + ":::::::" + freq.values());
        Object[] valArray = freq.values().toArray();

//        System.out.println(valArray);
        return 0;
    }

}
