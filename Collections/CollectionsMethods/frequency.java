package Collections.CollectionsMethods;

import java.util.*;

public class frequency {
    public static void main(String[] args) {
        List<String> fruits=Arrays.asList("Apple","Orenge","Goa","Kivi","Apple","Orenge","Apple");
        //Collections.frequency(Collection<?> c, Object o): Returns the number of occurrences of the specified element in the specified collection.
        int appleFreq=Collections.frequency(fruits, "Apple");
        int orengeFreq=Collections.frequency(fruits, "Orenge");
        System.out.println("Apple frequency in list is "+ appleFreq);
        System.out.println("Orenge frequency in list is "+ orengeFreq);
    }
}
