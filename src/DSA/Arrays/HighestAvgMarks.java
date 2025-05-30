package DSA.Arrays;

/*

Question 2)   Given a 2D array of students and marks. Find the highest average marks among students.

Example:-
Input - [ [Shubham, 55], [Shivam, 68], [Shubham, 97], [RItika,97]]
Output - 97

Input - [ [Karan, 55], [Shivam, 68], [Karan, 97]]
Output - 76 (Karan average mark is 76 which is greater than Shivam average marks 68)

 */


import java.util.*;

public class HighestAvgMarks {
    public static void main(String[] args) {
        List<List<Object>> input1 = Arrays.asList(
                Arrays.asList("Shubham", 55),
                Arrays.asList("Shivam", 68),
                Arrays.asList("Shubham", 97),
                Arrays.asList("Ritika", 97)
        );

        List<List<Object>> input2 = Arrays.asList(
                Arrays.asList("Karan", 55),
                Arrays.asList("Shivam", 68),
                Arrays.asList("Karan", 97)
        );

//        System.out.println(highestAverage(input1)); // Output: 97
        System.out.println(highestAverage(input2)); // Output: 76
    }

    private static int highestAverage(List<List<Object>> marks) {

        Map<String,List<Integer>> studentMarks = new HashMap<>();

        for (List<Object> record: marks){
            String name = (String) record.get(0);
            int score = (int) record.get(1);
            studentMarks.putIfAbsent(name,new ArrayList<>());
            studentMarks.get(name).add(score);
        }

        int maxAvg = 0;

        for (Map.Entry<String,List<Integer>> entry: studentMarks.entrySet()){
            List<Integer> marksSet = entry.getValue();
            int total = 0;

            for (Integer s: marksSet){
                total+=s;
            }
             int avg = total/marksSet.size();

            maxAvg = Math.max(maxAvg,avg);
        }

        return maxAvg;
    }
}
