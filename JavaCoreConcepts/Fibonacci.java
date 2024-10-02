package JavaCoreConcepts;

import java.util.Scanner;

public class Fibonacci {
    public static int Fib(int n){
        //base case
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return Fib(n-1)+Fib(n-2);
        }
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in fib seies: ");
        int terms=sc.nextInt();
        
        for(int i=0;i<terms;i++){
            System.out.print(Fibonacci.Fib(i)+" ");
        }
        sc.close();

    }
}
