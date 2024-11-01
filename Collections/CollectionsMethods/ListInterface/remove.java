package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class remove {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("List before removing 2nd index element :"+nums);
        nums.remove(2);
        System.out.println("list after removing element at 2nd index: "+ nums);


    }
}
