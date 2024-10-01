package JavaCoreConcepts;

import java.util.Scanner;

public class JavaForLoop {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        
        System.out.println("Printing numbers from 0 to n");
        PrintNumbers(n);
        System.out.println("Peinting alternative numbers from  0 to n: ");
        PrintAlternate(n);
        System.out.println("Enter number which you want to print table");
        int t=sc.nextInt();
        PrintTable(t);

        sc.close();
    }
    //method to print numbers from 0 to n
    public static void PrintNumbers(int n){
        for(int i=0;i<=n;i++){         
            System.out.println(i);
        }
    }

    //method to print numbers from 0 to 10 alternatively
    public static void PrintAlternate(int n){
        for(int i=0;i<=n;i+=2){        
            System.out.println(i);
        }
    }

    //printing n's table
    public static void PrintTable(int n){
        for(int i=0; i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
    
}
