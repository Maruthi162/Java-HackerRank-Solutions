package Collections;

import java.util.*;

public class LearnTreeMap {
    public static void main(String[] args) {
        Map<String,Integer> namesCount=new TreeMap<>();
        LinkedList<String> names= new LinkedList<>(Arrays.asList("Maruthi","Rahul","Maruthi","Rahul","Vivek","Hima","Jaanu"));
        for(String name:names){
            //check if exists or not
            if(namesCount.containsKey(name)){
                //if already present increment the count
                namesCount.put(name, namesCount.get(name)+1);
            }
            else{
                //if not already exists add new entry with 1 count
                namesCount.put(name, 1);
            }
        }

        for(Map.Entry<String,Integer> entry: namesCount.entrySet()){
            //since it's tree map, all the entrys are stored in sorted based on Key 
            System.out.println("Key: "+entry.getKey() +" Value: "+entry.getValue());
        }
    }
}
