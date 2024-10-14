package DSA.Strings;

/*Given two strings s1 and s2 consisting of lowercase characters, the task is to check whether the two given strings are anagrams of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “act” and “tac” are anagrams of each other.*/

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "act";
        String s2 = "tac";
        char[] s1_charArray = s1.toCharArray();
        char[] s2_charArray = s2.toCharArray();

        Arrays.sort(s1_charArray);
        Arrays.sort(s2_charArray);

        if (Arrays.equals(s1_charArray,s2_charArray))
            System.out.println("The strings "  +s1+" and "+s2+" are Anagrams");
        else
            System.out.println("The strings are not Anagrams");
    }
}
