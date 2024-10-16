package Collections.MethodsOfCollectionInterface;

import java.util.*;

public class Spliterator1 {
    //default Spliterator spliterator()
    public static void main(String[] args){
        List<String> list=Arrays.asList("A","B","C");
        Spliterator<String> spliterator=list.spliterator();
        spliterator.forEachRemaining(System.out::println);
    }
}
