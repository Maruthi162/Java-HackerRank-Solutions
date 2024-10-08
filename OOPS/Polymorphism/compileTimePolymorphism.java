package OOPS.Polymorphism;

import java.util.Scanner;

//compile time polymorphism can be achieved using methos overloading
class SUM{
    //same method name with 2 parameters
    public void Sum(int a, int b){
        System.out.println(a+b);
    }

    //same method name with 3 parameters
    public void Sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    //same method name with 4 parameters
    public void Sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
}


public class compileTimePolymorphism {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers you want to add");
        int num=sc.nextInt();
        System.out.println("Enter "+num +" numbers");
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        SUM sum=new SUM();
        switch (num) {
            case 2 -> {
                System.out.println("Sum Of two numbers: ");
                sum.Sum(arr[0], arr[1]);
            }
            case 3 ->{
                System.out.println("Sum of three numbers: ");
                sum.Sum(arr[0], arr[1], arr[2]);
            }
            case 4 ->{
                System.out.println("Sum of four numbers: ");
                sum.Sum(arr[0], arr[1], arr[2], arr[3]);
            }
        }  
        sc.close();     
    }
    
}
