package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class size {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        long size=nums.size();
        System.out.println(size);
    }
}
