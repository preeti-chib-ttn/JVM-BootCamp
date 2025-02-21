package MultiThreading.Day2;

import java.util.Random;
import java.util.concurrent.*;

/*
* Q4) WAP to return a random integer value from a thread execution using Future.*/
public class Question4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> getRandomInteger= ()-> new Random().nextInt();
        Future<Integer> randomIntegerFromCallable = executor.submit(getRandomInteger);
        System.out.println("The random integer is: "+randomIntegerFromCallable.get());

        executor.shutdown();
    }
}
