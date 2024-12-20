package MultiThreading;

class Thread1 implements Runnable{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=1;i<=5;i++){
            try{Thread.sleep(10000);}catch(Exception e){};
            System.out.println("Hello");
        }  
    }
}

class Thread2 implements Runnable{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=1;i<=5;i++){
            System.out.println("Hi");
            try{Thread.sleep(6000);}catch(Exception e){};
        }
    }
}

public class CreatingThreadUsingRunnableInterface1 {
    public static void main(String[] args) {
        Runnable obj1=new Thread1();
        Runnable obj2=new Thread2();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}
