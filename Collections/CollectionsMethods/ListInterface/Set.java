package Collections.CollectionsMethods.ListInterface;
import java.util.*;

public class Set {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("Alice","Bob","Charlie"));
        System.out.println(names);
        names.set(1, "Maruthi");
        System.out.println(names);
    }
}
