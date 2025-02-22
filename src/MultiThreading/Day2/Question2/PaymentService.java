package MultiThreading.Day2.Question2;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PaymentService{
    public final Lock lock = new ReentrantLock();
    public void completePayment(OrderService orderService) {
        try {
            // Pehle OrderService ka lock le rahe hain
            orderService.lock.lock();

            System.out.println("Payment service initiated by " + Thread.currentThread().getName());
            Thread.sleep(1000);
            lock.lock(); // Phir PaymentService ka lock le rahe hain
            System.out.println("Order confirmation received, Payment completed.");
            lock.unlock();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            orderService.lock.unlock();
        }
    }

}