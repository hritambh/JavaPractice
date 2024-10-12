package RandomDSA.Arrays;

import java.util.Arrays;

/*
Given a sorted array arr (sorted in ascending order) and a target, find if there exists any pair of elements (arr[i], arr[j]) such that their sum is equal to the target.
 */

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {-8, 1, 4, 6, 10, 45};
        int target = 16;
        if (checkIfAPairExists(arr,arr.length,target))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }

    private static boolean checkIfAPairExists(int[] arr, int length, int target) {
        Arrays.sort(arr);
        int l = 0,r = length-1, sum =0;
        while (l<r){
            sum = arr[l]+arr[r];
            if (sum==target){
                return true;
            }else if (sum<target)
                l++;
            else
                r--;
        }
        return false;
    }
}
