package MultiThreading.Day2.Question2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OrderService {
    public final Lock lock = new ReentrantLock();

    public void placeOrder(PaymentService paymentService){
            if(lock.tryLock()){ // locking for order
                try {
                    System.out.println(Thread.currentThread().getName()+" has placed order.");
                    System.out.println("Waiting for payment service...");
                    Thread.sleep(3000);
                    if(paymentService.lock.tryLock()) { // locking for payment
                        try {
                            System.out.println("Payment Service executed by "
                                    + Thread.currentThread().getName());
                        } finally {
                            paymentService.lock.unlock(); // unlocking after use
                        }
                    }else{
                        System.out.println("Unable to acquire lock on payment service.");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    lock.unlock(); // unlock when order is placed
                }

            }else{
                System.out.println("Failed to acquire lock on Order Service.");
            }

    }
}
