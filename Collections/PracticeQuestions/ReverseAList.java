package Collections.PracticeQuestions;

import java.util.*;
public class ReverseAList {

    // static List<Integer> reverse(List<Integer> list){
    //     List<Integer> rev=new ArrayList<>();

    //     for(int i=0;i<list.size();i++){
    //         int ele=list.get(list.size()-1-i);
    //         rev.add(ele);
    //     }
    //     return rev;
    // }
    
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of the list");
        int n=sc.nextInt();
        System.out.println("enter list elements one by one");
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            list.add(ele);
        }
        //method-1: creatinf own method and implementing reverse logic

        //List<Integer> reversedList= reverse(list);

        //method-2: calling reverse method from collections class

        Collections.reverse(list);
        sc.close();


        System.out.println(Arrays.toString(list.toArray()));
    }
}
