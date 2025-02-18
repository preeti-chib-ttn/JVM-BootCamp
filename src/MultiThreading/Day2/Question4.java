package MultiThreading.Day2;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
* Q4) WAP to return a random integer value from a thread execution using Future.*/
public class Question4 {
    public static void main(String[] args) {

        FutureTask<Integer> getRandomNumber = new FutureTask<>(()-> new Random().nextInt());
      new Thread(getRandomNumber).start();
        try {
            System.out.println("Random integer is: "+getRandomNumber.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
