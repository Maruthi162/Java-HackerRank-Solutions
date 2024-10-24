package Collections.CollectionsMethods;

import java.util.*;

public class max {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        //Collections.max(Collection<? extends T> coll): Returns the maximum element of the given collection.
        int max=Collections.max(nums);
        System.out.println("Maximum value of given list is : "+max);
    }
}
