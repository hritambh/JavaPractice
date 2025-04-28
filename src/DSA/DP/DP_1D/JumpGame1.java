package DSA.DP.DP_1D;

public class JumpGame1 {
    public static void main(String[] args) {
        int[] stones = {2,3,1,1,4};
        System.out.println(isJumpPossible(stones));
    }

    private static boolean isJumpPossible(int[] stones) {
        int farthest = Integer.MIN_VALUE;
        for (int i = 0; i < stones.length; i++) {
            System.out.println("Value of i is ::" +i );
            if(i>farthest)
                return false;
            farthest = Math.max(farthest,i+stones[i]);
        }
        return true;
    }
}
