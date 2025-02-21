package MultiThreading.Day2.Question1;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*Q1) WAP to show usage of Callable and demonstrate how it is different from Runnable */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Callable Task
        Callable<String> callable = () -> {
            System.out.println("Simulating some string transformation from callable...");
            Thread.sleep(3000);
            return "This is a string from callable after transformation";
        };
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread callableThread = new Thread(futureTask);

        // Runnable Task
        String[] stringObject = new String[1];
        Thread runnableThread = new Thread(()->{

            System.out.println("Simulating some string transformation from runnable...");
            try { // try catch mandatory for runnable
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            stringObject[0]= "This is not directly returned by runnable";
        });

        runnableThread.start();
        callableThread.start();
        System.out.println("Result: " + futureTask.get());
        runnableThread.join();
        System.out.println(stringObject[0]);
    }
}
