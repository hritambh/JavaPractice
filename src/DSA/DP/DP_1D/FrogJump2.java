package DSA.DP.DP_1D;

public class FrogJump2 {
    public static void main(String[] args) {
        int[] stones = {2,3,1,4,1,1,1,2};
        System.out.println(minJumps(stones));
    }

    private static int minJumps(int[] stones) {
        int maxJump = stones[1]-stones[0];
        for (int i = 2; i < stones.length ; i++) {
            int jumDistance = stones[i] -stones[i-2];
            maxJump = Math.max(maxJump,jumDistance);
        }
        return maxJump;
    }
}
