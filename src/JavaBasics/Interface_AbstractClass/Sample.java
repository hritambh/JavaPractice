package JavaBasics.Interface_AbstractClass;

import java.text.SimpleDateFormat;
import java.util.*;

public class Sample {
    public static void main(String[] args) {
        String[] words = {"cc","ll","xx"};
        System.out.println(checkLargest(words));
    }

    private static int checkLargest(String[] words) {
        int count =0;
        Stack<String> visited = new Stack<>();
        for (String word: words){
            if (word.charAt(0)==word.charAt(1)){
                count++;
            }else {
                StringBuilder sr = new StringBuilder();
                sr.append(word.charAt(1));
                sr.append(word.charAt(0));
                if (visited.contains(sr.toString())){
                    visited.remove(sr.toString());
                    count +=2;
                }else {
                    visited.add(word);
                }
            }
        }
        return 2*count;
    }
}
