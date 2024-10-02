package JavaCoreConcepts.Recurssion;

import java.util.Scanner;

public class SumOfDigits {
    
    public static int DigitSum(int n){
        //base case
        return (n==0)?0:(n%10)+DigitSum(n/10);

        // return switch(n){
        //     case 0 -> 0;
        //     case 1 -> 1;
        //     case 2 -> 2;
        //     case 3 -> 3;
        //     case 4 -> 4;
        //     case 5 -> 5;
        //     case 6 -> 6;
        //     case 7 -> 7;
        //     case 8 -> 8;
        //     case 9 -> 9;
        //     default -> n%10 + DigitSum(n/10);
        // };
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to calculate it's digit sum");
        int num=sc.nextInt();
        sc.close();
        System.out.println("digit sum of "+num+" is "+SumOfDigits.DigitSum(num));
    }
}
