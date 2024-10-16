package exceptionHandling;

import java.util.Scanner;

class InvalidArgumentException extends Exception{
    public InvalidArgumentException(String str){
        super(str);
    }
}
public class JavaCustomExceptions {

    static void method(int num) throws InvalidArgumentException{
        if(num==7){
            throw new InvalidArgumentException("7 is not valid here");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number 7 to get exception");
        int num=sc.nextInt();
        try{
            method(num);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            sc.close();
        }
    }
}
