package MultiThreading.Day2;
/* Q5) WAP to showcase the difference
between shutdown() and shutdownNow(). */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;
import java.util.concurrent.TimeUnit;

public class Question5 {
    // to rename default pool for better clarity
    static class CustomThreadFactory implements ThreadFactory {
        private final String poolName;
        private int threadCount = 1;
        public CustomThreadFactory(String poolName) {
            this.poolName = poolName;
        }
        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "[ "+poolName + ":Thread" + (threadCount++)+" ]");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService1 = Executors.newFixedThreadPool(3,
                new CustomThreadFactory("Shutdown example"));
        ExecutorService executorService2 = Executors.newFixedThreadPool(3,
                new CustomThreadFactory("Shutdown Now example"));

        // our task that will run on both thread pools
        Runnable runnableTask = () -> {
            System.out.println("### Task Started ###" + Thread.currentThread().getName());

            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " Interrupted by shutdown Now !!!!");
            }
            System.out.println(Thread.currentThread().getName() + " Completed***");
        };


        for (int i = 0; i < 4; i++) {
            executorService1.submit(runnableTask);
        }
        System.out.println("Executor Service 1 is been called shutdown()");
        executorService1.shutdown();
        System.out.println("Executor Service 1 is Shutdown: "+executorService1.isShutdown());
        boolean terminated = executorService1.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("All the task of Service one done? "+ terminated);



        for (int i = 0; i < 4; i++) {
            executorService2.submit(runnableTask);
        }
        System.out.println("Executor Service 2 is been called shutdownNow()");
        executorService2.shutdownNow();
        System.out.println("Executor Service 2 is Shutdown Now: "+executorService2.isShutdown());
        boolean terminatedNow = executorService1.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("All the task of Service 2 done? "+ terminatedNow);
    }

}
