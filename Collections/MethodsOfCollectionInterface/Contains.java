package Collections.MethodsOfCollectionInterface;

import java.util.ArrayList;
import java.util.*;

public class Contains {
    //public boolean contains(Object element)
    public static void main(String[] args){
        List<String> cars=new ArrayList<>(Arrays.asList("TATA","Toyota","Benz"));
        //returns true id collection contains Maruthi
        boolean isContained=cars.contains("TATA");
        System.out.println(isContained);
    }
}
