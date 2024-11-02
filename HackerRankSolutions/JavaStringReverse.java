package HackerRankSolutions;

import java.util.Scanner;

public class JavaStringReverse {
     public static String IsPalindrom(String str){
        //base case
        if(str.length()==1 || str.length()==0){
            return "Yes";
        }
        //iteration case
        if(str.charAt(0)==(str.charAt(str.length()-1))){
            
            String trimedStr=str.substring(1,str.length()-1);
            return IsPalindrom(trimedStr);
        }
        else{
            return "No";
        }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(IsPalindrom(A));
        
    }
}
