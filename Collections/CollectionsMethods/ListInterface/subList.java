package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class subList {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("Alice","Bob","Charlie","Don"));
        System.out.println(names);
        List<String> subList=names.subList(1, 3);
        System.out.println(subList);
    }
}
