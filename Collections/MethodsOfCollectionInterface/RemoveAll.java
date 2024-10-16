package Collections.MethodsOfCollectionInterface;

import java.util.*;

public class RemoveAll {
    //public boolean removeAll(Collection<?> c)
    public static void main(String[] args){
        List<String> list1=new ArrayList<>(Arrays.asList("A","B","C","D"));
        List<String> list2=new ArrayList<>((Arrays.asList("A","B")));
        list1.removeAll(list2);
        System.out.println(list1);

    }
}
