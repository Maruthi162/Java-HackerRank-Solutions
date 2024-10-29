package Collections.StreamAPIMethods;
import java.util.*;

public class Count {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
        long count=nums.stream().count();
        System.out.println("length of the stream: "+count);

    }
}
