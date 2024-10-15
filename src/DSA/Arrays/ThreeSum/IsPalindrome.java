package DSA.Arrays.ThreeSum;

/*
Given a string s, return true if it is a palindrome, otherwise return false.
A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
Example 1:
Input: s = "Was it a car or a cat I saw?"
Output: true
*/

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw";;
        siPalindrome(s);
    }

    private static void siPalindrome(String s) {
        s = s.trim().replace(" ", "");
        s= s.toLowerCase();
        int l =0;
        int r = s.length()-1;
        boolean isPalin = true;
        while (l<r){
            if (s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }else{
                isPalin =false;
                break;
            }
        }
        if (isPalin)
            System.out.println("Is a Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
