package Collections.StreamAPIMethods.Collect;
import java.util.*;
import java.util.stream.*;

public class SummarizingInt {
    public static void main(String[] args) {
        List<Integer>nums=Arrays.asList(1,2,3,4,5,6);
        //getting statics of integer array, lly we can get stats of long and double
        IntSummaryStatistics stats=nums.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(stats);

    }
}
