package Collections.PracticeQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class KArrayReverse {
    public static LinkedList<Integer> KReverse(LinkedList<Integer> list, int k){
      // Base case: If the list size is less than k, return the list as it is
     if(list.size()<k){
         return list;
     }
     // Create a result list to store the processed elements
     LinkedList<Integer> res=new LinkedList<>();
     // Get the first k elements and reverse them
     List<Integer> sublist= list.subList(0,k);
     Collections.reverse(sublist);
     // Add the reversed sublist to the result
     res.addAll(sublist);
     // Recursively call KReverse on the remaining list after removing the first k elements
     LinkedList<Integer> remainingList= new LinkedList<>(list.subList(k,list.size()));
     res.addAll(KReverse(remainingList, k));// Add the result of the next recursion
     
     return res;
  }
    
   public static void main(String[] args) {

       LinkedList<Integer> list=new LinkedList<>(Arrays.asList(2,1,2,3,12)); //output: [1,2,3,2,12]
       int k=2;
       
       LinkedList<Integer> res=KReverse(list, k);
       System.out.println(res);
   }   
}
