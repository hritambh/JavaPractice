package DSA.Arrays.ThreeSum;

/*
Given an array arr[] of size n and an integer sum. Find if there’s a triplet in the array which sums up to the given integer sum.
int[] arr = { 1, 4, 45, 6, 10, 8 };
int sum = 22;
*/

import java.util.Arrays;

public class ThreeSumPointers {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        checkIfTripletExists(arr,sum);
    }

    private static boolean checkIfTripletExists(int[] arr, int sum) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n-2; i++) {
            int l = i+1;
            int r = n-1;
            while (l<r){
                int req_summ = arr[i] + arr[l]+arr[r];
                if (req_summ == sum){
                    System.out.printf("Triplets are %d %d %d ", arr[i],arr[l],arr[r]);                    return true;
                } else if (req_summ < sum) {
                    l++;
                }else
                    r--;
            }
        }
        return false;
    }
}
