package exceptionHandling;

public class JavaExceptionPropagation {
    void divide(){
        float res=10/0;
        System.out.println(res);
    }
    void Calculator(){
        divide();
    }
    public static void main(String[] args){
        JavaExceptionPropagation obj=new JavaExceptionPropagation();
        try{
            obj.Calculator();//checks in calculator method then unchecked exceptions are forwarded to inside method divide
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();
        }
        System.out.println("Flow will be continued...........");
    }
}
