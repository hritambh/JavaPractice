package DSA.Arrays.ThreeSum;

/*
Given an array arr[] of size n and an integer sum. Find if there’s a triplet in the array which sums up to the given integer sum.
int[] arr = { 1, 4, 45, 6, 10, 8 };
int sum = 22;
*/

import java.util.HashSet;

public class OptimesedThreeSum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        checkIfTripletExists(arr,sum);
    }

    private static boolean checkIfTripletExists(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n-2; i++) {
            int sum = target - arr[i];
            HashSet<Integer> s =new HashSet<>();
            int req_sum = target - arr[i];
            for (int j = i; j < n; j++) {
                req_sum -= arr[j];
                if (s.contains(req_sum)){
                    System.out.printf("Triplets are %d %d %d ", arr[i],arr[j],req_sum);
                    return true;
                }
                s.add(arr[j]);
                req_sum += arr[j];
            }
        }
        return false;
    }
}
