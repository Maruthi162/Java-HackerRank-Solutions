package Collections.MethodsOfCollectionInterface;

import java.util.*;

public class ParallelStream {
    //default Stream<E> parallelStream()
    public static void main(String[] args){
        List<String> list=Arrays.asList("A","B","C");
        list.parallelStream().forEach(System.out::println);
    }
}
