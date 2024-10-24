package Collections.CollectionsMethods;

import java.util.*;

public class min {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        //Collections.min(Collection<? extends T> coll): Returns the minimum element of the given collection.
        int min=Collections.min(nums);
        System.out.println("minimum value of nums is : "+ min);
    }
}
