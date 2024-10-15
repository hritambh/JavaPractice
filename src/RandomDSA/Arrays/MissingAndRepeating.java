package RandomDSA.Arrays;

//Given an unsorted array arr of of positive integers.
// One number A from set [1, 2,....,n] is missing and one number B occurs twice in array.
// Find numbers A and B.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 5, 4, 6, 7, 5};
//        int[] ans = findMissingAndRepeating_approach1_brute(array,array.length);
        int[] ans = findMissingAndRepeating_approac21_hashArray(array,array.length);
        System.out.println("The duplicate is : "+ ans[0]+ " and the repeating is : "+ ans[1]);
    }

    private static int[] findMissingAndRepeating_approac21_hashArray(int[] array, int length) {
        int[] freq = new int[length+1];

        for (int i = 0; i < length; i++) {
            freq[array[i]]++;
        }
        int missing = -1,duplicate=-1;
        for (int i = 1; i < length+1; i++) {
            if (freq[i]==0)
                missing = i;
            else if (freq[i]>=2)
                duplicate=i;
            if (missing!=-1 && duplicate!=-1)
                break;
        }

        return new int[]{duplicate,missing};

    }

    private static int[] findMissingAndRepeating_approach1_brute(int[] array, int length) {
        int missing = -1,duplicate=-1;
        for (int i = 1; i <= length; i++) {
            int count =0;
            for (int j = 0; j < length; j++) {
                if (array[j]==i)
                    count++;
            }
            if (count >= 2)
                duplicate = i;
            else if (count==0)
                missing = i;
            if (missing!=-1 && duplicate!=-1)
                break;
        }
        return new int[]{duplicate,missing};
    }
}
