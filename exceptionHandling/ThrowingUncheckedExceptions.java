package exceptionHandling;

import java.util.Scanner;

public class ThrowingUncheckedExceptions {
    void ValidateAge(int age){
        if(age<18){
            throw new ArithmeticException("Not Eligible for voting");
        }
        else{
            System.out.println("Eligible for voting");
        }
    }
    public static void main(String[] args){
        ThrowingUncheckedExceptions obj=new ThrowingUncheckedExceptions();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age to validate: ");
        int age=sc.nextInt();
        try{
            obj.ValidateAge(age);
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        finally{
            sc.close();
        }
        System.out.println("Flow will be continued");
    }
}
