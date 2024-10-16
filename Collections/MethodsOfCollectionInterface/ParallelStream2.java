package Collections.MethodsOfCollectionInterface;

import java.util.*;
import java.util.stream.Collectors;

public class ParallelStream2 {
    //default Stream<E> parallelStream()
    public static void main(String[] args){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> squaredNumbers=numbers.parallelStream()
                                            .map(n->n*n)
                                            .filter(n->n>5)// select only whose square value in more than 5
                                            .collect(Collectors.toList());

        squaredNumbers.forEach(System.out::println);

    }
}
