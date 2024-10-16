package Collections.MethodsOfCollectionInterface;
import java.util.*;

public class Stream {
    //default Stream<E> Stream()
    public static void main(String[] args){
        List<String> list= Arrays.asList("A","B","C","D");
        list.stream().forEach(System.out::println); //returns asequencial stream unlike parallel stream
        
    }
}
