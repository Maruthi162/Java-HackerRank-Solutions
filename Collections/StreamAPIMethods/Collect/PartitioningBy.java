package Collections.StreamAPIMethods.Collect;
import java.util.*;
import java.util.stream.*;

public class PartitioningBy {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8);
        //psrtitioning even and odd numbers
        Map<Boolean,List<Integer>> evenPartitioned=nums.stream().collect(Collectors.partitioningBy(n->n%2==0));

        evenPartitioned.forEach((key, value)->System.out.println(key +"="+value));
    }
}
