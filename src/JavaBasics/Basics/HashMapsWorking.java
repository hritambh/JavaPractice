package JavaBasics.Basics;

import java.util.*;

public class HashMapsWorking {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Integer>> newMap = new HashMap<>();

        newMap.put(1, new ArrayList<>());
        newMap.get(1).add(23);
        newMap.get(1).add(24);
        newMap.get(1).add(25);
        newMap.get(1).add(26);

        newMap.put(3, new ArrayList<>());
        newMap.get(3).add(43);
        newMap.get(3).add(44);
        newMap.get(3).add(45);
        newMap.get(3).add(46);

        System.out.println("Check if the hashmap is Empty :: "+ newMap.isEmpty());

        System.out.println("The key set for the hashmap is :: "+ newMap.keySet());
        System.out.println("The values set for the hashmap is :: "+ newMap.values());

        System.out.println("Check if the map contains a key 5 :: "+newMap.containsKey(5));
        System.out.println("Check if the map contains a key 3 :: "+newMap.containsKey(3));

        System.out.println("Check if the map contains value [23, 24, 25, 26] :: "+ newMap.containsValue(Arrays.asList(23, 24, 25, 26)));
        System.out.println("Check if the map contains value [23, 24, 25, 27] :: "+ newMap.containsValue(Arrays.asList(23, 24, 25, 27)));

        for (Map.Entry<Integer,ArrayList<Integer>> entry: newMap.entrySet()){
            System.out.println("For Key :: "+ entry.getKey()+ " the value is :: " + entry.getValue());
        }
    }
}
