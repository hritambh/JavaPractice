package DSA.Arrays;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] stones = {0,1,3,5,6,8,12,17};
        System.out.println(canCross(stones,0,1));
    }

    static boolean canCross(int[] stones,int lastIdx,int currentIdx ){
        if(currentIdx ==stones.length-1)
            return true;
        int lastJump = stones[currentIdx]-stones[lastIdx];
        System.out.println("Current Position is ::" +currentIdx + " and last jum was of " + lastJump + " units");
        int nextIdx = currentIdx+1;

        while (nextIdx <stones.length && stones[nextIdx]<= stones[currentIdx]+lastJump+1){
            int nextJump =stones[nextIdx] - stones[currentIdx];
            int jump = nextJump -lastJump;

            if (jump>=-1 && jump<=1){
                if (canCross(stones,currentIdx,nextIdx))
                    return true;
            }
            nextIdx++;
        }


        return false;
    }
}
