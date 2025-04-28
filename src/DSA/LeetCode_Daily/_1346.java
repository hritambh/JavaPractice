package DSA.LeetCode_Daily;

//1346. Check If N and Its Double Exist
//        Easy
//Topics
//        Companies
//Hint
//Given an array arr of integers, check if there exist two indices i and j such that :
//
//i != j
//0 <= i, j < arr.length
//arr[i] == 2 * arr[j]

public class _1346 {
    public static void main(String[] args) {
        int[] arr ={-20,8,-6,-14,0,-19,14,4};
        System.out.println(checkIfExist(arr));
    }

    private static boolean checkIfExist(int[] arr) {
        int i=0;
        while (i<arr.length-2){
            int j=i+1;
            while (j<arr.length-1){
                if (i!=j && (arr[i]==2*arr[j] || arr[j]==2*arr[i] ))
                    return true;
                j++;
            }
            i++;
        }
        return false;
    }
}
