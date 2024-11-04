package Collections;

import java.util.*;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, Integer> nums=new HashMap<>();

        nums.put("One", 1);
        nums.put("Two",10);
        System.out.println(nums);
        //if we add same key again it will be override the old value
        nums.put("Two",2);
        //add entry if key is not present
        nums.putIfAbsent("One", 10);
        System.out.println(nums);
        //gettig all keys of map
        Set<String> Keys=nums.keySet();
       //iterating through values
       System.out.println("Values of map:");
       for(Integer i:nums.values()){
        System.out.println(i);
       }
        System.out.println("Key Set: "+Keys);
        //itersting through map using entrySet() and getKey() and getValue() methods
        for(Map.Entry<String,Integer> entry: nums.entrySet()){
            System.out.println("Key: "+entry.getKey()+ " Value: "+entry.getValue());
        }

    }
}
