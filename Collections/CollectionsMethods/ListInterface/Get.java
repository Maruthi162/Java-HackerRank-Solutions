package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class Get {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("Maruthi","Govind","Abdul"));
        String nameAt2=names.get(2);
        System.out.println("Name at 2nd index: "+nameAt2);

    }
}
