package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class RemoveAll {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> removes=new ArrayList<>(Arrays.asList(1,2,3));
        //removing removes list from nums list
        nums.removeAll(removes);
        System.out.println(nums);
    }
}
