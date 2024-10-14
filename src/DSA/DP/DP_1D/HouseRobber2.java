package DSA.DP.DP_1D;

/*You are given an integer array nums where nums[i] represents the amount of money the ith house has. The houses are arranged in a circle, i.e. the first house and the last house are neighbors.
You are planning to rob money from the houses, but you cannot rob two adjacent houses because the security system will automatically alert the police if two adjacent houses were both broken into.
Return the maximum amount of money you can rob without alerting the police.
Input: nums = [2,9,8,3,6]
Output: 15*/

import java.util.Arrays;

public class HouseRobber2 {
    public static void main(String[] args) {
        int[] nums = {2,9,8,3,6};
        System.out.println(maxRobberyAmt(nums));
    }

    private static int maxRobberyAmt(int[] nums) {
        int n = nums.length;
        if (n<2)
            return nums[0];
        int lastIncluded = helper(Arrays.copyOfRange(nums,1,n));
        int lastExcluded = helper(Arrays.copyOfRange(nums,0,n-1));
        return Math.max(lastIncluded,lastIncluded);
    }

    private static int helper(int[] houses) {
        if (houses.length<2)
            return houses[0];

        int n = houses.length;

        int[] lootAtHouses = new int[n];
        lootAtHouses[0] = houses[0];
        lootAtHouses[1] = Math.max(houses[0],houses[1]);

        for (int i = 2; i < n; i++){
            lootAtHouses[i] = Math.max((lootAtHouses[i-2]+houses[i]),lootAtHouses[i-1]);
        }
        for (int np: lootAtHouses)
            System.out.print(np + "  ");
        System.out.println();
        return lootAtHouses[n-1];
    }
}
