package RandomDSA.Strings;

import java.util.ArrayList;
import java.util.HashMap;

/*Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
Example 1:
Input: strs = ["act","pots","tops","cat","stop","hat"]
Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]*/

public class GroupAnagrams {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("ogd");
        list.add("god");
        list.add("atc");
        list.add("abc");
        System.out.println(solver(list));
    }

    private static ArrayList<ArrayList<String>> solver(ArrayList<String> list) {
        HashMap<HashMap<Character,Integer>,ArrayList<String>> map = new HashMap<>();
        for (String str: list){
            HashMap<Character,Integer> tempMap = new HashMap<Character,Integer>();
            for (int i = 0; i < str.length(); i++) {
                if (tempMap.containsValue(str.charAt(i))){
                    int x = tempMap.get(str.charAt(i));
                    tempMap.put(str.charAt(i),++x);
                }else {
                    tempMap.put(str.charAt(i),1);
                }
            }

            if (map.containsKey(tempMap))
                map.get(tempMap).add(str);
            else {
                ArrayList<String> tempList = new ArrayList<>();
                tempList.add(str);
                map.put(tempMap,tempList);
            }
        }

        ArrayList<ArrayList<String> >
                result = new ArrayList<>();
        for (HashMap<Character, Integer>
                temp : map.keySet())
            result.add(map.get(temp));
        return result;
    }
}
