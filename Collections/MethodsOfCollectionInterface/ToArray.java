package Collections.MethodsOfCollectionInterface;

import java.util.*;

public class ToArray {
    //public object[] toArray()
    public static void main(String[] args){
        List<String> list=new ArrayList<>(Arrays.asList("Maruthi","Govind","Chandra"));
        Object[] arr= list.toArray(); 
        System.out.println(Arrays.toString(arr));
    }   
}
