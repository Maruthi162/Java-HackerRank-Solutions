package HackerRankSolutions.HackerRankDataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int noOfQueries=sc.nextInt();
        for(int i=0;i<noOfQueries;i++){
            String qType=sc.next();
            if(qType.equals("Insert")){
                int index=sc.nextInt();
                int el=sc.nextInt();
                list.add(index,el);
            }
            else if(qType.equals("Delete")){
                int index=sc.nextInt();
                list.remove(index);
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        sc.close();
        for(int lEle:list){
            System.out.print(lEle+" ");
        }
        
    }
}
