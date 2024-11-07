package HackerRankSolutions.HackerRankDataStructures;

import java.util.Scanner;

public class JavaSubArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        sc.close();
        
        //implementing logic
        int negitiveSumCount=0;
        
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j]; 
                if(sum<0){
                    negitiveSumCount++;
                 }       
            }
            
        }
        System.out.println(negitiveSumCount);
    }
}
