package Collections.StreamAPIMethods.Collect;
import java.util.*;
import java.util.stream.*;
public class GroupingBy {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Maruthi", "Govind", "Chandra", "Bhargavi", "Goodd");

        // Group names by their length
        Map<Integer, List<String>> namesGroupByCount = names.stream()
            .collect(Collectors.groupingBy(String::length));

        // Print the grouped names
        System.out.println(namesGroupByCount);
    }
}
