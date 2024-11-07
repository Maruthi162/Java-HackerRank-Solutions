package HackerRankSolutions.HackerRankDataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        for(int i=0;i<n;i++){
            int d= sc.nextInt();
            ArrayList<Integer> nums=new ArrayList<>();
            for(int j=0;j<d;j++)
            {
                nums.add(sc.nextInt());
            }
            matrix.add(nums);
        }
        //System.out.println(matrix);
        
        int noOfOperations= sc.nextInt();
        for(int k=0;k<noOfOperations;k++){
            int i=sc.nextInt();
            i--; //decrementing to achieve 1 based indexing
            int j=sc.nextInt();
            j--; //decrementing to achieve 1 based indexing
            
            if(i>=matrix.size() || j>= matrix.get(i).size()){
                System.out.println("ERROR!");
            }
            else{
                System.out.println(matrix.get(i).get(j));
            }
        }
        sc.close();
        
    }
}
