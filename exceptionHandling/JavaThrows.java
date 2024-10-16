package exceptionHandling;

import java.io.IOException;

public class JavaThrows {
    //by using throws we will declare the exception for the method, by declaring exception checked exceptions can be propagated (forwarded in call stack)
    static void CheckedExceptionExample() throws IOException{
        throw new IOException("Device error");
    }

    static void m(){
        try{
            CheckedExceptionExample();
        }
        catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
    public static void main(String[] args){

        m();
        System.out.println("Normal flow will be continued");

    }
}
