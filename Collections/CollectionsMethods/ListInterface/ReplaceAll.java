package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class ReplaceAll {
    public static void main(String[] args) {
        //replacing integers
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        nums.replaceAll(n->n*n);
        System.out.println(nums);

        //replacing strings
        List<String> names=new ArrayList<>(Arrays.asList("Alice","Bob","Charlie"));
        names.replaceAll(name->"Dr. "+ name);
        System.out.println(names);
    }
}
