package RandomDSA.Arrays;

import java.util.Arrays;

public class MergeIntervals {

    // Merge overlapping intervals in-place and return
    // the new size of the array
    public static int mergeOverlap(int[][] arr) {

        // Sort intervals based on start values
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int resIdx = 0; // Index of the last merged interval

        for (int i = 1; i < arr.length; i++) {

            // If current interval overlaps with the last merged interval
            if (arr[resIdx][1] >= arr[i][0]) {
                arr[resIdx][1] = Math.max(arr[resIdx][1], arr[i][1]);
            } else {
                // Move to the next interval
                resIdx++;
                arr[resIdx] = arr[i];
            }
            for (int[] ar: arr){
                System.out.printf(Arrays.toString(ar)+ "  ");
            }
            System.out.println();
            System.out.println("=================");
        }

        // Return the size of the merged intervals
        return resIdx + 1;
    }

    // Driver Code
    public static void main(String[] args) {
        int[][] arr = { { 11, 13 }, { 1, 9 }, { 2, 4 }, { 4, 7 } };

        // Get the new size of the array after merging
        int newSize = mergeOverlap(arr);

        // Print the merged intervals based on the new size
        System.out.print("The Merged Intervals are: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print("[" + arr[i][0] + ", " + arr[i][1] + "] ");
        }
        System.out.println();
    }
}
