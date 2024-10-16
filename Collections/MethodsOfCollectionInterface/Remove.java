package Collections.MethodsOfCollectionInterface;

import java.util.*;

public class Remove {
    //public boolean remove(Object element)
    public static void main(String[] args){
        List<String> list= new ArrayList<>();
        list.add("Maruthi");
        list.add("Maruthi");
        list.remove("Maruthi");
        System.out.println(list);
    }
}
