package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class Add {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        //adding element to add
        nums.add(10);
        System.out.println(nums);
        //adding element at specific position
        nums.add(1,29);

        System.out.println(nums);
    }
}
