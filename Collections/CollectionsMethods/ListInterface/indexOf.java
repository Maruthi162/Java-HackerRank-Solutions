package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class indexOf {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int indexOf2=nums.indexOf(2);
        System.out.println("Index of 2 in nums is="+indexOf2);
    }
}
