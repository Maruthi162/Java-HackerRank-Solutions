package Collections;
import java.util.*;

public class LearnArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adque=new ArrayDeque<>();

        adque.offer(10);
        adque.offer(20);
        //inserting element at first
        adque.offerFirst(30);
        adque.offer(40);
        //inserting element at last
        adque.offerLast(50);

        System.out.println("Array Dequeue: "+ adque);

        //removing first element
        adque.pollFirst();

        System.out.println("After removing first element using pollFirst : "+adque);

        //removing last element
        adque.pollLast();
        System.out.println("After removing last element using pollLast: "+ adque);

        //getting peek element from front end
        System.out.println("peek element from front end: "+ adque.peekFirst());
        //getting peek element from rear end
        System.out.println("Peek element from rear end "+ adque.peekLast());



    }
}
