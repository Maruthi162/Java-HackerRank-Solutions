public class DoubleToIntCasting {
    public static void main(String[] args) {
        // Converting double to int
        double d = 21474836445.05; // more than int capacity
        int a = (int) d; // gives only 2147483647 which max capacity of int.
        System.out.println("The value of a is " + a);
        //adding int, float and double values to ibserve output
        int x=1;
        float y=2.3f;
        double z=3.342;
        System.out.println(x+y+z);

        //string to int
        String str="10"; //Convert to int since valid number
        //if String str="text" it will throw an Invalid number exception error
        try{
            int n= Integer.parseInt(str);
            System.out.println("Convert int value="+ n);
        }
        catch(Exception ex){
            System.out.println("Invalid number formate"+ ex);
        }

        //Converting int to string
        System.out.println("Converting from int to string");
        int n=23432;
        String numberString= String.valueOf(n);
        System.out.println(numberString);
 }
}


