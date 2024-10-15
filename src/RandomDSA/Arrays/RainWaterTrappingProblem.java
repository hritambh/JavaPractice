package RandomDSA.Arrays;

/* this question is based on Array preprocessing */

import java.util.Arrays;

public class RainWaterTrappingProblem {
    public static void main(String[] args) {
        int[] buildingHeights = {3,1,2,4,0,1,3,2};
        int max = Integer.MIN_VALUE;
        int[] leftPreComputed = new int[buildingHeights.length];
        int[] rightPreComputed = new int[buildingHeights.length];

        for (int i = 0; i < buildingHeights.length; i++) {
            max = Math.max(max,buildingHeights[i]);
            leftPreComputed[i]= max;
        }
        max = Integer.MIN_VALUE;

        for (int j = buildingHeights.length-1; j >=0 ; j--) {
            max = Math.max(max,buildingHeights[j]);
            rightPreComputed[j]= max;
        }
        System.out.println(Arrays.toString(buildingHeights));
        System.out.println(Arrays.toString(leftPreComputed));
        System.out.println(Arrays.toString(rightPreComputed));

        int totalRainWaterTraped = 0;
        for (int i = 0; i < buildingHeights.length; i++) {
            int water = Math.min(leftPreComputed[i],rightPreComputed[i]);
            water = water-buildingHeights[i];
            totalRainWaterTraped+=water;
            System.out.println("For water at index "+i+ " min water to be stored is "+ water);
        }

        System.out.println("Total water trapper will be :: "+ totalRainWaterTraped);
    }
}
