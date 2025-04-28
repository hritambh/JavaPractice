package JavaBasics.Basics;


// input array = [1,2,3,4,5,6]
// d =2;
// output array = [3,4,5,6,1,2]

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int d = 2;
        rotateArray(array,d);

        for (Integer i: array)
            System.out.print(i+" ");

    }

    private static int[] rotateArray(int[] array, int d) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = d; i < array.length ; i++) {
            newArray.add(array[i]);
        }
        for (int i = 0; i < d; i++) {
            newArray.add(array[i]);
        }
//        for (Integer i: newArray)
//            System.out.print(i+" ");

        for (int i = 0; i < array.length; i++) {
            array[i] = newArray.get(i);
        }
        return array;
    }
}
