package Collections.MethodsOfCollectionInterface;

import java.util.*;

public class HashCode {
    //public int hashCode()
    public static void main(String[] args){
        List<String> list=Arrays.asList("Maruthi","Govind","Chandra");
        int hashCode=list.hashCode();
        System.out.println("Hash code for list is "+ hashCode);
    }
}
