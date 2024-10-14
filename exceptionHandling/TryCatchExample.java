package exceptionHandling;

public class TryCatchExample {
    public static void main(String[] args){
        //intializing with 0 to avoid uninitialized variable error
        int res=0;
        try{
            res=50/0;
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();
        }
        
        System.out.println("Remaining code flow will be maintained");
        System.out.println(10+res); //res will be 0 if exception occurs
    }
}
