package MultiThreading.Day1;
/*Q1) Create and Run a Thread using Runnable Interface
and Thread class and show usage of sleep and
join methods in the created threads.
 */

class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" started.");
        try {
            System.out.println(Thread.currentThread().getName()+" going to sleep...");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" woke up.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" completed.");
    }
}

public class Question1 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Thread1(),"thread1");
        Thread thread2 = new Thread(new Thread1(),"thread2");
        Thread thread3 = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" started.");
            try {
                System.out.println(Thread.currentThread().getName()+" going to sleep...");
                Thread.sleep(10000);
                System.out.println(Thread.currentThread().getName()+" woke up.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" completed.");
        },"thread3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // main thread waits for thread1 and thread2 to over
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("This is a line from main and this will " +
                "executed only after thread1 and thread2 are over.");
        try {
            // main thread waits for thread3 to over
            thread3.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("This is a line from main " +
                "and this will executed only after thread3 is over.");
    }
}
