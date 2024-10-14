package exceptionHandling.MultiCatchblock;

public class WrongUseOfMultiCatch {
    public static void main(String[] args){
        String[] names={"Maruthi","Govind","Guna"};
        String lastName="Exception occured";
        try{
            lastName=names[3];
        }
        //multiple catch blocks must be ordered from from most specific to most general
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        //can't write below code which will generate the error
        // catch(ArithmeticException ae){
        //     ae.printStackTrace();
        // }
        finally{
            System.out.println("Lasgt name:" +lastName);
        }
    }
}
