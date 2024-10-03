package JavaCoreConcepts.Recurssion;

import java.util.Scanner;

public class PowerCalculation {
    static int Power(int x, int n){
        //base case
        if(n==0){
            return 1;
        }
        //recurssive case
        else{
            return x*Power(x,n-1);   // 2^3 == 2*P(2,2)--> 2*2*P(2,1) --> 4*2*P(2,0) --> 6*1 --> 1
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter x= ");
        int x=sc.nextInt();
        System.out.println("enter n= ");
        int n=sc.nextInt();
        sc.close();
        System.out.println("Tha value of " + x+"^"+n+" is "+ Power(x, n));
    }
}

class Calculate{
   
}
