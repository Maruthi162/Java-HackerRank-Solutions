package Collections.StreamAPIMethods.Collect;
import java.util.*;
import java.util.stream.*;

public class Counting {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Maruthi","Hima","Bhargavi","Anjali");
        long count=names.stream().collect(Collectors.counting());
        System.out.println(count);
    }
}
