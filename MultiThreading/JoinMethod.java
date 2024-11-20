package MultiThreading;

public class JoinMethod {
    public static void main(String[] args) {
         // since runnable is functional interface we can create Thread using lamda expression and anonymous class and Runnable 
        Runnable obj1=  ()-> 
                            {
                                for(int i=0;i<5;i++){
                                    System.out.println("Hi");
                                    try{
                                        Thread.sleep(1000);
                                    }
                                    catch(InterruptedException e){
                                        System.out.println(e);
                                    }
                                }
                            };
        //creating thread for Runnable interface
        Thread t1= new Thread(obj1);
        t1.start(); ///calls run method
        
        //since runnable is functional interface we can create Thread using lamda expression
        Runnable obj2= ()->
                        {
                            for(int i=0;i<5;i++){
                                System.out.println("Hello");
                                try{
                                    Thread.sleep(1000);
                                }
                                catch(InterruptedException e){
                                    System.out.println(e);
                                }
                            }
                        };
        Thread t2= new Thread(obj2);
        t2.start();
        //join methods makes main thread to wait for threads t1,t2 to complete
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(t1.toString());
        System.out.println(t2.toString());
    
    }
}
