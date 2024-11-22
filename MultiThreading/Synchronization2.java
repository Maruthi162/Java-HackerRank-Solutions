package MultiThreading;

class Counter {
    int count;

    // use synchronized to avoid collisions of two threads while accessing this at
    // the same time
    public synchronized void Increment() {
        count++;
    }
}

public class Synchronization2 {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();
        // object for synchronization
        final Object lock = new Object();

        // thred t1 using anonymous class
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    synchronized (lock) {
                        c.Increment();
                        lock.notify();//notify t2 to proceed
                        try {
                            if (i < 1000) {
                                lock.wait(); //wait for t2 to complete
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        // Thread t2 using lambda expression
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    synchronized (lock) {
                        c.Increment();
                        lock.notify(); //notify t1 to proceed
                        try {
                            if (i < 1000) {
                                lock.wait();//wait for t1 to complete
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join(); // used throws to avoid axceptions

        System.out.println("Count = " + c.count);
    }
}
