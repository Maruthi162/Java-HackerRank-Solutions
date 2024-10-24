package Collections.CollectionsMethods;
import java.util.*;

public class sort {
    public static void main(String[] args) {
        List<String> fruits=Arrays.asList("Banana","Apple","Kivi","Orenge","Goa");
        //Collections.sort(List<T> list): Sorts the specified list into ascending order.
        Collections.sort(fruits);
        System.out.println(fruits.toString());
    }
}
