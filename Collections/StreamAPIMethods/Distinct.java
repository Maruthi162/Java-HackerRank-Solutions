package Collections.StreamAPIMethods;
import java.util.*;
import java.util.stream.*;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,53,2,3,2,4,5,6);
        //collects only single occurence of each element
        List<Integer> distNums=nums.stream().distinct().collect(Collectors.toList());
        System.out.println(distNums);

    }
}
