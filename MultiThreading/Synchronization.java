package MultiThreading;

class Thread1 implements Runnable {
    private final Object lock;

    public Thread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 1; i <= 5; i++) {
            synchronized (lock) {
                System.out.println("Hello");
                lock.notify();

                try {
                    if (i < 5) {
                        lock.wait();
                        // Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            // try{Thread.sleep(10000);}catch(Exception e){};
        }
    }
}

class Thread2 implements Runnable {
    private final Object lock;

    public Thread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 1; i <= 5; i++) {
            synchronized (lock) {
                System.out.println("Hi");
                lock.notify();

                try {
                    if (i < 5) {
                        lock.wait();
                        // Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            // try{Thread.sleep(10000);}catch(Exception e){};
        }
    }
}

public class Synchronization {
    public static void main(String[] args) {
        // Shared lock object for synchronization
        Object lock = new Object();

        // Create the Runnable objects for both threads
        Runnable obj1 = new Thread1(lock);
        Runnable obj2 = new Thread2(lock);

        // Create Thread objects
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Start the threads
        t1.start();
        t2.start();
    }
}
