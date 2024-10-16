package Collections.MethodsOfCollectionInterface;

import java.util.ArrayList;
import java.util.*;

public class toArrayWithType {
    //public <T> T[] toArray(T[] a)
    public static void main(String[] args){
        List<String> list=new ArrayList<>(Arrays.asList("A","B","C","D"));
        String[] arr= list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }
}
