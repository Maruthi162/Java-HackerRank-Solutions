package Collections.CollectionsMethods;

import java.util.*;

public class Copy {
    public static void main(String[] args) {
        List<Integer> src=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        //Collections.copy() method. This method requires the destination list (dest) to be of the same size or larger than the source list (src)
        //
        // Initialize the destination list with the same size as the source list
        List<Integer> dest = new ArrayList<>(Collections.nCopies(src.size(), 0)); // Fill with dummy values
        System.out.println(dest.toString());
        Collections.copy(dest, src);
        System.out.println(dest.toString());
    }
}
