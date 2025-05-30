package DSA.LeetCode_Daily;

//1128. Number of Equivalent Domino Pairs
//        Easy
//Topics
//        Companies
//Hint
//Given a list of dominoes, dominoes[i} = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a == c and b == d), or (a == d and b == c) - that is, one domino can be rotated to be equal to another domino.
//
//Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].
//
//
//
//Example 1:
//
//Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
//Output: 1
//Example 2:
//
//Input: dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]]
//Output: 3


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1128 {
    public static void main(String[] args) {
        int[][] dominoesList = {{1,2},{1,2},{1,1},{1,2},{2,2}};
        System.out.println(numEquivDominoPairs(dominoesList));
    }

    private static int numEquivDominoPairs(int[][] dominoesList) {
        int count =0;
        int n = dominoesList.length;
        ArrayList<List<Integer>> setA = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> temp1  = Arrays.asList(dominoesList[i][0],dominoesList[i][1]);
            List<Integer> temp2  =  Arrays.asList(dominoesList[i][1],dominoesList[i][0]);
            if (setA.contains(temp1) || setA.contains(temp2))
                count++;
            else {
                setA.add(temp1);
                setA.add(temp2);
            }
        }


        return count+1;
    }
}
