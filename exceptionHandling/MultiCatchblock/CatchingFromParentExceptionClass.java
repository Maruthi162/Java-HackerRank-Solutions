package exceptionHandling.MultiCatchblock;

public class CatchingFromParentExceptionClass {
    public static void main(String[] args){
        int res=0;
        try{
            res=10/0;
        }
        catch(ArrayIndexOutOfBoundsException aiobe){
            aiobe.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Handling exception from parent class. "+ e.getMessage());
        }
        System.out.println("value of res= "+res);
    }
}
