package DSA.DP.DP_1D;

/*Given a string s, return the longest substring of s that is a palindrome.
A palindrome is a string that reads the same forward and backward.
If there are multiple palindromic substrings that have the same length, return any one of them.
Example:
Input: s = "ababd"
Output: "bab"
*/

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
//        if (checkPal(s,0,s.length()-1))
//            System.out.println("Is Palindrome");
//        else
//            System.out.println("Not Palindrome");
        System.out.println(longestPalSubstr(s));
    }

    private static String longestPalSubstr(String s) {
        int n = s.length();
        int maxLen = 1, start = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkPal(s,i,j) && (j-i+1)>maxLen){
                    start = i;
                    maxLen = j-i+1;
                }
            }
        }
        return s.substring(start,start+maxLen);
    }

    private static boolean checkPal(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
