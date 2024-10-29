package Collections.StreamAPIMethods;
import java.util.*;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(30,2,3,4,5,6);
        Optional<Integer> firstEle=nums.stream().findFirst();
        System.out.println(firstEle);
    }
}
