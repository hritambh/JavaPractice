package JavaBasics.Basics;

public class Separate0s1sand2s {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2 };
        sort012(arr);

        for (int i:arr)
            System.out.print(i+" ");
    }

    private static void sort012(int[] arr) {
        int lo=0, mid =0, hi = arr.length-1;
        while(mid<=hi){
            if (arr[mid] == 0){
                swapNosInArray(arr,lo,mid);
                mid++;
                lo++;
            }else if (arr[mid]== 1){
                mid++;
            }else {
                swapNosInArray(arr,mid,hi);
                hi--;
            }
        }
    }

    private static void swapNosInArray(int[] arr, int lo, int mid) {
        int temp;
        temp = arr[lo];
        arr[lo] = arr[mid];
        arr[mid] = temp;
    }
}
