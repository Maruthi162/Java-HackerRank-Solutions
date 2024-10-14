package exceptionHandling.MultiCatchblock;

public class OrderedMultiCatchExample {
    public static void main(String[] args){
        String[] names={"Maruthi","Govind","Guna"};
        String lastPersonName="Exception Occured";
        try{
            lastPersonName=names[3];
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();
        }
        catch(NumberFormatException nfe){
            nfe.printStackTrace();
        }
        //here exception will be handled
        catch(ArrayIndexOutOfBoundsException aiobe){
            aiobe.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Parent exception occured");
        }
        finally{
            System.out.println("LAst person name: "+lastPersonName);
        }
    }
}
