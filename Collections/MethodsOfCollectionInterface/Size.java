package Collections.MethodsOfCollectionInterface;

import java.util.ArrayList;
import java.util.*;

public class Size {
    //public int size()
    public static void main(String[] args){
        List<String> list=new ArrayList<>(Arrays.asList("Maruthi","govind","Chandra","Rahul"));
        int length=list.size();
        System.out.println("Length of the given collection is "+ length);
    }
}
