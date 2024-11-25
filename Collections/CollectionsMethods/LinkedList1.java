package Collections.CollectionsMethods;
import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        /* code */
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        Collections.reverse(l);
        String num=l.toString();
        System.out.println(num);
    }
    
}
