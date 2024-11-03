package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueWithComparator {
    public static void main(String[] args) {
        //Comparator to prioritize larger element first
         Queue<Integer> priorityQueue=new PriorityQueue<>(Comparator.reverseOrder());
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
