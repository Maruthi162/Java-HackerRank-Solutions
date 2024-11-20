package MultiThreading;

public class ThreadPriority {
    public static void main(String[] args) {
        // priority is represented in between 1 to 10
        // 1 is least priority and
        // 10 is max priority
        int a=30;
        int b=20;
        Thread t1= new Thread(()->{
            int sum=a+b;
            System.out.println("Sum of "+a+" and "+b + " is "+ sum);
        },"Sum Thread");
        Thread t2= new Thread(()->{
            int sum=a-b;
            System.out.println("substraction of "+a+" and "+b + " is "+ sum);
        }, "Substraction Thread");
        //print thread name and priority
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        //set min priority to Sum Thread
        t1.setPriority(Thread.MIN_PRIORITY); //since t1 has min priority hence it will be executed after executing max priority threads
        //set max priority to Sub
        t2.setPriority(Thread.MAX_PRIORITY); //since t2 has max priority it will be executed first
         //print thread name and priority
         System.out.println(t1.toString());
         System.out.println(t2.toString());
         t1.start();
         t2.start();
    }
}
