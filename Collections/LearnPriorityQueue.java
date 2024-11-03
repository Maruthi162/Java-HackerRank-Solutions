package Collections;
import java.util.*;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        //by default priority queue follows min heap i.e smallest element have highest priority, we can can create our own priority using Comparator in constructor
        Queue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.offer(23);
        priorityQueue.offer(32);
        priorityQueue.offer(20);
        priorityQueue.offer(10);
        priorityQueue.offer(24);

        System.out.println("Initial PQueue: "+ priorityQueue);

        System.out.println("next element ready to remove "+ priorityQueue.peek());

        priorityQueue.poll();

        System.out.println("After removing peek element priority queue: "+ priorityQueue);

        System.out.println("next element ready to remove "+ priorityQueue.peek());
    }
}
