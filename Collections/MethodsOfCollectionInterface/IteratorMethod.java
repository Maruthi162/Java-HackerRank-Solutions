package Collections.MethodsOfCollectionInterface;

import java.util.*;

public class IteratorMethod {
    //public Iterator<E> iterator()
    public static void main(String[] args){
        List<String> lst=new ArrayList<>(Arrays.asList("A","B","C","D"));
        //creating iterator for colection
        Iterator<String> iterator=lst.iterator();
        while(iterator.hasNext()){
            String ele=iterator.next();
            System.out.println(ele);
        }
    }
    
}
