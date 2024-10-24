package Collections.CollectionsMethods;

import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        //Collections.shuffle(List<?> list): Randomly permutes the elements in the specified list.
        Collections.shuffle(nums);
        System.out.println(nums.toString());
    }
}
