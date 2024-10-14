package exceptionHandling;

import java.util.Scanner;

public class TryFinallyExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of subjects");
        int noOfSubs=sc.nextInt();
        int[] marks=new int[noOfSubs];
        for(int i=0;i<noOfSubs;i++){
            System.out.println("Enter marks in subject "+(i+1));
            int mark=sc.nextInt();
            marks[i]=mark;
        }
        int MathMarks=0;
        try{
            MathMarks=marks[4];
            //below line will not be executed if exception occurs
            System.out.println("Maths marks= "+MathMarks);
        }
        catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println(aiobe.getMessage());
        }
        finally{
            sc.close();

        }
        System.out.println("Remaining code flow will be maintained");
        
    }
}
