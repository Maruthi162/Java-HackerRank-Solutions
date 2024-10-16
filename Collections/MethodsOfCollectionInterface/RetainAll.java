package Collections.MethodsOfCollectionInterface;

import java.util.*;

public class RetainAll {
    //public boolean retainAll(Collection<?> c)
    public static void main(String[] args){
        List<String> list1=new ArrayList<>(Arrays.asList("A","B","C","D"));
        List<String> list2=new ArrayList<>(Arrays.asList("C","D"));
        //retain only C and D
        list1.retainAll(list2);
        System.out.println(list1);
    }
}
