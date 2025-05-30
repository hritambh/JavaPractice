package DSA.Strings;

import java.util.List;

public class LongestUniformSubString {
    public static void main(String[] args) {
        String s = "aabbbbcde";
        System.out.println(longest(s));
    }

    private static List<Integer> longest(String s) {
        int n = s.length();
        int maxCount = 0;
        int index = 0;
        int i =0;
        while (i<n){
            int j = i;

            while (j<n && s.charAt(j)==s.charAt(i))
                j++;

            int len = j-i;

            if (len>maxCount){
                maxCount= len;
                index = i;
            }

            i=j;
        }

        return List.of(index,maxCount);
    }
}
