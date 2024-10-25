package Collections.StreamAPIMethods;

import java.util.*;

public class Stream {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        //Converts a collection to a stream for functional-style operations.
        nums.stream()
            .forEach(System.out::println); //prints each number
    }
}
