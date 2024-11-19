package MultiThreading;

public class MultiThreadingUsingAnonymousClass {
    public static void main(String[] args) {
        //creating Thread using anonymous class and Runnable 
        Runnable obj1= new Runnable()
        {
            @Override
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("Hi");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        };
        //creating thread for Runnable interface
        Thread t1= new Thread(obj1);
        //creating Thread using anonymous class and Thread class 
        Thread t2= new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("Hello");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        });
        t1.start(); ///calls run method
        try{Thread.sleep(20);}catch(InterruptedException e){};
        t2.start(); 
    }
    
}
