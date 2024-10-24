package Collections.CollectionsMethods;

import java.util.*;

public class reverse {
    public static void main(String[] args){
        List<String> fruits=Arrays.asList("Apple","Orenge","Banana","Kivi");
        //Collections.reverse(List<?> list): Reverses the order of the elements in the specified list.
        Collections.reverse(fruits);
        System.out.println(fruits.toString());
    }
}
