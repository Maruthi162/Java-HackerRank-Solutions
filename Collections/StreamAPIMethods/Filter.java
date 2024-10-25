package Collections.StreamAPIMethods;

import java.util.*;
import java.util.stream.Collectors;

public class Filter {
    //. filter(Predicate<? super T> predicate)
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> evenNums=nums.stream()
                                    .filter(n-> n%2==0) //keeps only even numbers
                                    .collect(Collectors.toList());

        System.out.println(evenNums.toString());

    }
}
