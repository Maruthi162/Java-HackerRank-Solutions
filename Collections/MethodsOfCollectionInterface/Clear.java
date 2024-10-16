package Collections.MethodsOfCollectionInterface;
import java.util.*;
public class Clear {
    //public vois clear()
    public static void main(String[] args){
        List<String> list=new ArrayList<>(Arrays.asList("Maruthi","Govind","Chandra","Guna"));
        System.out.println("Before clearing the collection: "+list);
        list.clear();
        System.out.println("After applying clear method "+ list);
    }
}
