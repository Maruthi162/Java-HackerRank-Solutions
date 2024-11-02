package Collections.CollectionsMethods.ArrayList;
import java.util.*;


public class ArrayListDeclaration {
    public static void main(String[] args) {
        //declaring empty list
        ArrayList<String> names=new ArrayList<>();
        names.add("Maruthi");
        //declaring arraylist of specified collection
        ArrayList<String> fruits=new ArrayList<>(Arrays.asList("Apple","Ball","Cat","Dog"));
        //declaring arrayList with initial capacity
        ArrayList<Integer> nums=new ArrayList<>(5);
        //adding elements to nums of initial capacity of 5
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);

        //iterating through namIterator
        Iterator<String> namIterator=names.iterator();
        namIterator.forEachRemaining(System.out :: println);

        //Iterating through fruits
        Iterator<String> fruitsIterator = fruits.iterator();
        fruitsIterator.forEachRemaining(System.out :: println);

        //iterating through nums of initial capacity 5
        Iterator<Integer> numIterator=nums.iterator();
        numIterator.forEachRemaining(System.out :: println);
    }
}
