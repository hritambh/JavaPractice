package RandomDSA.Arrays.ThreeSum;

/*
Given an array arr[] of size n and an integer sum. Find if there’s a triplet in the array which sums up to the given integer sum.
int[] arr = { 1, 4, 45, 6, 10, 8 };
int sum = 22;
*/

public class BruteForceThreeSum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int target = 22;
        if (checkIfTripletExists(arr,target))
            System.out.println("Tripplet Found");
        else
            System.out.println("Tripplet Not Found");
    }

    private static boolean checkIfTripletExists(int[] arr, int target) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j <n-1 ; j++) {
                for (int k = j+1; k <n ; k++) {
                    sum += arr[i] + arr[j] + arr[k];
                    if (sum==target){
                        System.out.printf("The triplet is %d %d %d :: ",arr[i],arr[j],arr[k]);
                        return true;
                    }
                    sum = 0;
                }
            }
        }
        return false;
    }
}
