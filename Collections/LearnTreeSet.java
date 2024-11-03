package Collections;

import java.util.*;

public class LearnTreeSet {
    public static void main(String[] args) {
         Set<Integer> set=new TreeSet<>();
        //TreeSet implement binarySearchTree hence stores elements in sorted order
        set.add(22);
        set.add(32);
        set.add(12);
        set.add(42);
        set.add(52);
        //trying to add duplicates
        set.add(12);
        //printing hashset
        System.out.println("Initial Set: "+set);
        //finding size of set
        System.out.println("Size of hashSet: "+set.size());
        //check if set id empty
        System.out.println("Set is Empty: "+set.isEmpty());
        //check if set contains particular value
        System.out.println("set contains 12 : "+ set.contains(12));
        //remove 22 from set
        System.out.println("Removed: "+set.remove(22));
        //after removing elemen
        System.out.println("Afteer removing 22: "+set);
    }
}
