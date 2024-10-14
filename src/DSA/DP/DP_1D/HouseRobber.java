package DSA.DP.DP_1D;


import java.util.TimeZone;
import java.util.Timer;

/*
You are given an integer array nums where nums[i] represents the amount of money the ith house has. The houses are arranged in a straight line, i.e. the ith house is the neighbor of the (i-1)th and (i+1)th house.
You are planning to rob money from the houses, but you cannot rob two adjacent houses because the security system will automatically alert the police if two adjacent houses were both broken into.
Return the maximum amount of money you can rob without alerting the police.

Input: nums = [2,9,8,3,6]
Output: 16
Explanation: nums[0] + nums[2] + nums[4] = 2 + 8 + 6 = 16.

*/
public class HouseRobber {
    public static void main(String[] args) {
        int[] houses = {2,7,3,1,4,2,1,8};
//        System.out.println(maxRobbery(houses,houses.length));
        System.out.println(maxRobberyTabulated(houses));
    }

    private static int maxRobberyTabulated(int[] houses) {
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

    private static int maxRobbery(int[] houses, int noOfHouses) {
        if (noOfHouses==1)
            return houses[noOfHouses-1];
        else if (noOfHouses==2) {
            return Math.max(houses[noOfHouses-1],houses[noOfHouses-2]);
        }
        int pick = houses[noOfHouses-1] + maxRobbery(houses,noOfHouses -2);
        int notPick = maxRobbery(houses,noOfHouses-1);
        return Math.max(pick,notPick);
    }
}
