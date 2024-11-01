package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class Equals {
    public static void main(String[] args) {
        List<Integer> nums1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> nums2=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        boolean isSame=nums1.equals(nums2);
        System.out.println("both lists are same: "+isSame);
    }
}
