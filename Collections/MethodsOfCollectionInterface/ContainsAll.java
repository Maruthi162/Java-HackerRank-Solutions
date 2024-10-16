package Collections.MethodsOfCollectionInterface;

import java.util.ArrayList;
import java.util.*;

public class ContainsAll {
    //public boolean containsAll(Collection<?> c):
    public static void main(String[] args){
        List<String> list1=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        List<String> list2=new ArrayList<>(Arrays.asList("B","C","E"));
        boolean isContainsAll=list1.containsAll(list2);
        System.out.println("list1 contains all elements of list2: "+isContainsAll);
    }
}
