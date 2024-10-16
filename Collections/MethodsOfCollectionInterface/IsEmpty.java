package Collections.MethodsOfCollectionInterface;

import java.util.ArrayList;
import java.util.*;

public class IsEmpty {
    //public boolean isEmpty()
    public static void main(String[] args){
        List<String> list=new ArrayList<>(); //empty colection
        boolean iscollectionEmpty=list.isEmpty(); //returns true
        System.out.println("Collection is empty: "+iscollectionEmpty);
    }
}
