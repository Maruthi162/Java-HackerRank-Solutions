package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class ckear {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        nums.clear();
        if(nums.isEmpty()){
            System.out.println("List is empty");
        }
        else{
            System.out.println("list is not empty");
        }
    }
}
