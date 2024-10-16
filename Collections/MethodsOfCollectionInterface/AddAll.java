package Collections.MethodsOfCollectionInterface;

import java.util.*;

public class AddAll {
    //public boolean addAll(Collection<?extends E> C)
    public static void main(String[] args){
        List<String> list1=new ArrayList<>();
        list1.add("Maruthi");
        //second list
        List<String> list2=new ArrayList<>();
        list2.add("Govind");

        //adding list2 to the list1
        list1.addAll(list2);
        System.out.println(list1);
    }
}
