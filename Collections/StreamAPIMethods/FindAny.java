package Collections.StreamAPIMethods;
import java.util.*;

public class FindAny {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        Optional<Integer> anyElement=nums.stream().findAny();
        System.out.println(anyElement);
    }
}
