package Collections.StreamAPIMethods;

import java.util.*;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        // collect(Collector<? super T,A,R> collector)
        //joining list items by ,
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
        String combinedResult=nums.stream()
                                .map(String::valueOf)//converts integers to string
                                .collect(Collectors.joining(",","[","]")); //joins elements by ,
        System.out.println(combinedResult.toString());

        //Example -2
        long count=nums.stream()
                        .collect(Collectors.counting());
        System.out.println("Count: "+count);
    }
}
