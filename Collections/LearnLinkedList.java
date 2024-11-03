package Collections;
import java.util.*;

public class LearnLinkedList {
    public static void main(String[] args) {
        //Linked list implements both list and queue
        //Implementing List Interface from LinkedList class
        List<Integer> nums=new LinkedList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(32);
        System.out.println(nums);
        System.out.println("Element at index 2 : "+nums.get(2));

        //Implmenting Queue Interface from LinkedList class
        Queue<Integer> queue=new LinkedList<Integer>();
        //queue.add(2) --> this is also insert the elements into queue, if insertion successfull returns true, if not throws exceptions which may crash the application
        queue.offer(1);//offer will Insert element into queue, if insertion successfull returns true, if not returns false
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);
        System.out.println("Initial queue: "+ queue);
        //queue follow first in first out i.e first added elelment will be removed first
        queue.poll(); //poll will remove the first entered element

        System.out.println("Queue after removing the peek element: "+queue );

        int peek=queue.peek();

        System.out.println("next peek element ready to remove id : "+peek);

    }
}
