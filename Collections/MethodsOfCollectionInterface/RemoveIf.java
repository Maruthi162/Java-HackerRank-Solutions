package Collections.MethodsOfCollectionInterface;

import java.util.*;

public class RemoveIf {
    //dafualt boolean removeIf(predicate<? super E> filter)
    public static void main(String[] args){
        List<Integer> nums=new ArrayList<>((Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
        // removing all even numbers from the list using removeIf() method
        nums.removeIf(n->n%2==0);
        System.out.println(nums);
    }
}
