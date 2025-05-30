package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SyntaxPractise {
    public static void main(String[] args) {
        int[] arr1 = {2,5,3,7,8,5};
        int[] arr2 = {2,5,3,7,8,5};

        List<Integer> newArr = new ArrayList<>();
        for (int i:arr2)
            newArr.add(i);

//        System.out.println(newArr);

        int[] arr3 = Arrays.copyOf(arr1,3);

        for (int i1:arr3)
            System.out.print(i1+ " " );

    }
}
