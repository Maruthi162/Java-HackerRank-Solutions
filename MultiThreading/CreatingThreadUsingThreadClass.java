package MultiThreading;

//
public class CreatingThreadUsingThreadClass{
    public static void main(String[] args) {
        Thread t1=new Thread1();
        Thread t2=new Thread2();
        t1.start(); //when we start thread by default thread will call run() method
        t2.start(); //when we start thread by default thread will call run() method
        
    }
}
//thread1 created by extending Thread class
class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread1");
            try{Thread.sleep(600);} catch(Exception e){};
        }
    }
}
//thread2 created by extending Thread class
class Thread2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("My thread 2");
            try{Thread.sleep(500);} catch(Exception e){};
        }
    }
}
