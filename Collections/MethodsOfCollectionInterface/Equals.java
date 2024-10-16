package Collections.MethodsOfCollectionInterface;

import java.util.*;

public class Equals {
    //public boolean equals(Object element)
    public static void main(String[] args){
        List<String> list1=Arrays.asList("Maruthi","Govind","Guna");
        List<String> list2=Arrays.asList("Maruthi","Govind","Guna");
        boolean areEqual=list1.equals(list2); //return true if each element matches with the element in another class along with the order
        System.out.println("List1 and list2 are equal: "+ areEqual);
    }
}
