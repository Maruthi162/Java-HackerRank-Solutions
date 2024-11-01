package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class hashCode {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4));
        int hashCode=nums.hashCode();
        System.out.println("hashCode of nums list: "+ hashCode);
    }
}
