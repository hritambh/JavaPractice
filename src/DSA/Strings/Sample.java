package DSA.Strings;

//3522. Calculate Score After Performing Instructions
//        Medium
//        Topics
//        Companies
//        Hint
//        You are given two arrays, instructions and values, both of size n.
//
//        You need to simulate a process based on the following rules:
//
//        You start at the first instruction at index i = 0 with an initial score of 0.
//        If instructions[i] is "add":
//        Add values[i] to your score.
//        Move to the next instruction (i + 1).
//        If instructions[i] is "jump":
//        Move to the instruction at index (i + values[i]) without modifying your score.
//        The process ends when you either:
//
//        Go out of bounds (i.e., i < 0 or i >= n), or
//        Attempt to revisit an instruction that has been previously executed. The revisited instruction is not executed.
//        Return your score at the end of the process.




import java.sql.Array;
import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        int[] arr = {2,4,11,3};
        int sum = 6;
        int[] res = twoSum(arr,sum);

        for (int num: res){
            System.out.print(num+ " ");
        }
    }

    private static int[] twoSum(int[] arr, int sum) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        int i1 =0;
        int i2 =0;


        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],i));
            int target = sum - arr[i];
            if (map.containsKey(target)){
                i1=i;
                i2 = map.get(target);
                break;
            }
        }


        return new int[]{i1,i2};
    }
}
