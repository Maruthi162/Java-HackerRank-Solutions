package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class toArray {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        //converting list to arrays of type object
        Object[] arr=nums.toArray();
        System.out.println(Arrays.toString(arr));

        //converrting list to array of type Integer
        Integer[] narr=nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(narr));


    }
}
