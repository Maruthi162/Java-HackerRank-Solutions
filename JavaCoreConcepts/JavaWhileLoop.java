package JavaCoreConcepts;
import java.util.*;

public class JavaWhileLoop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        PrintNumbersUsingWhileLoop(n);
        System.out.println("Enter number to get digits");
        int num=sc.nextInt();
        getDigits(num);
        sc.close();

    }

    public static void PrintNumbersUsingWhileLoop(int n){
        int i=0;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }

    //print digits of a number
    public static void getDigits(int n){
        
        while(n>0){
            int digit=n%10;
            System.out.println(digit);
            n/=10;
        }

    }
    
}
