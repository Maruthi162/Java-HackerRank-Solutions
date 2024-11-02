package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class RetainAll {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2));
        List<Integer> retains=new ArrayList<>(Arrays.asList(1,2,3));
        nums.retainAll(retains);
        System.out.println(nums);
    }
}
