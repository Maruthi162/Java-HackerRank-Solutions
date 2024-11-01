package Collections.CollectionsMethods.ListInterface;
import java.util.*;
public class addAll {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("Alice","bob","charlie"));
        List<String> moreNames=new ArrayList<>(Arrays.asList("Don","Eric"));
        //adding more names to end
        names.addAll(moreNames);
        System.out.println(names);

        //adding more names at index 1
        List<String> someMoreNames=new ArrayList<>(Arrays.asList("Feury","George"));
        names.addAll(2,someMoreNames);
        System.out.println(names);

    }
}
