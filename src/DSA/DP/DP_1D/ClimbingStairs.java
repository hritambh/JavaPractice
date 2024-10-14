package DSA.DP.DP_1D;

/*
    You are given an integer n representing the number of steps to reach the top of a staircase.
    You can climb with either 1 or 2 steps at a time.
    Return the number of distinct ways to climb to the top of the staircase

    Example:
    Input: n = 3
    Output: 3
    Explanation:
    1 + 1 + 1 = 3
    1 + 2 = 3
    2 + 1 = 3
*/

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(waysToClimb(n,dp));
    }

    private static int waysToClimb(int n,int[] dp) {
        if (n==0 || n==1)
            return 1;
        if (dp[n]!=-1)
            return dp[n];
        else
            dp[n] = waysToClimb(n-1,dp) + waysToClimb(n-2,dp);
        return dp[n];
    }
}
