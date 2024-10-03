package JavaCoreConcepts.Recurssion;

import java.util.Scanner;

public class FactorialUsingRecurssion {
    
    public static long Factorial(long n){
        //base case
        if(n==0){
            return 1;
        }
        //recurssive case
        else{
            return n*Factorial(n-1);
        }
    }
}

class Program{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to calculate factorial: ");
        long n=sc.nextLong();
        sc.close();
        if(n<0){
            System.out.println("can't find factorial for negetive integers.");
        }
        else{
            long res=FactorialUsingRecurssion.Factorial(n);
            System.out.println("Factorial of "+n+" is "+res);
        } 
    }
}
