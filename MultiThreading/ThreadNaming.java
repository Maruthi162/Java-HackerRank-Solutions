package MultiThreading;

public class ThreadNaming {
    public static void main(String[] args) {
        Thread t1= new Thread( ()->{
            for(int i=0;i<5;i++){
                System.out.println("Hi");
                try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Hello");
                try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
            }
        });
        //get thread name
        System.out.println(t1.getName());
        //get thread priority of t1
        System.out.println(t1.getPriority());
        //set name to t1
        t1.setName("Hi Thread");
        System.out.println(t1.getName());
        //set priority to t1
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        t1.start();
        t2.start();
    }
}
