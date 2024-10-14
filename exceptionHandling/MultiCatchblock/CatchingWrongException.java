package exceptionHandling.MultiCatchblock;

public class CatchingWrongException {
    public static void main(String[] args){
        int res=0;
        try{
            res=10/0;
        }
        //catching wrong exception, in this case JVM calls default exception handler to handle Arithmetic Exception
        catch(ArrayIndexOutOfBoundsException aiobe){
            aiobe.printStackTrace();
        }
        finally{
            System.out.println("Value of res: "+res);
        }
        System.out.println("Remaining flow will be maintained");
    }
}
