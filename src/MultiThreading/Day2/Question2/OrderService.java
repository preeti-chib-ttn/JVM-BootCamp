package MultiThreading.Day2.Question2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OrderService {
    public final Lock lock = new ReentrantLock();

    public void placeOrder(PaymentService paymentService){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " has placed order.");
            Thread.sleep(1000);
            System.out.println("Waiting for payment service...");

            paymentService.lock.lock(); // Always lock PaymentService after OrderService
            System.out.println("Payment Service executed by " + Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            paymentService.lock.unlock();
            lock.unlock();
        }
    }
}
