package DSA.Arrays;

/*
You are given an integer array heights where heights[i] represents the height of the ith bar.
You may choose any two bars to form a container. Return the maximum amount of water a container can store.
height = [1,7,2,5,4,7,3,6]
Output: 36
*/

public class ContainerWithMostWater {
    public static void main(String[] args) {
//        int[] heights = {1,7,2,5,4,7,3,6};
        int[] heights = {2,2,2};
//        getLargestContainer_Brute(heights);
        System.out.println(getLargestContainer_Optimised(heights));
    }

    private static int getLargestContainer_Optimised(int[] heights) {
        int l =0;
        int r = heights.length-1;
        int area = Integer.MIN_VALUE;
        while (l<r){
            int tempArea = (r-l)*Math.min(heights[l],heights[r]);
            area = Math.max(area,tempArea);
            if (heights[l]<heights[r])
                l++;
            else
                r--;
        }
        return area;
    }

    private static void getLargestContainer_Brute(int[] heights) {
        int n =heights.length;
        int max = Integer.MIN_VALUE;
        int index1 =-1;
        int index2 =-1;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int lowerHeight = Math.min(heights[i],heights[j]);
                int width = j-i;
                int area = lowerHeight*width;
                if (area > max){
                    max = area;
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("The heights selected are :: "+ heights[index1]+" and "+ heights[index2]);
        System.out.println(max);
    }
}
