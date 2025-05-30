package DSA.Arrays;

/*
arr = [1, 2, 3, 5, 8], K = 10

Subarrays with sum ≥ 10:
- [2, 3, 5] = 10 (length 3)
- [3, 5, 8] = 16 (length 3)
- [5, 8] = 13 (length 2) ✅
- [8] = 8 (less than 10)

So, the minimum length subarray with sum ≥ 10 is [5, 8] of length 2.
 */

import java.util.Arrays;

public class MinSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,8,10};
        int k = 10;


        System.out.println(minlength(arr,k));
    }

    private static int minlength(int[] arr, int k) {
        int n = arr.length;
        int left = 0, sum =0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum>= k){
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left++];
            }

        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
