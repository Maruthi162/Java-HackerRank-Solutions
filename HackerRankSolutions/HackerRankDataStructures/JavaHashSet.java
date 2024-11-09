package HackerRankSolutions.HackerRankDataStructures;

import java.util.AbstractMap;
import java.util.*;
import java.util.Map;
import java.util.Scanner;

public class JavaHashSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        s.close();

//Write your code here
        //to store pairs use Map.Entry<K,V>
        Set<Map.Entry<String,String>> Uniquepairs=new HashSet<>();
        for(int i=0;i<t;i++){
            String a=pair_left[i];
            String b=pair_right[i];
            //use Map.Entry to store entry
            Map.Entry<String,String> entry= new AbstractMap.SimpleEntry<>(a,b);
            Uniquepairs.add(entry);
            System.out.println(Uniquepairs.size());      
        }
       
   }
}
