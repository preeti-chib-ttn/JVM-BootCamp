package MultiThreading.Day2.Question2;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PaymentService{
    public final Lock lock = new ReentrantLock();
    public  void completePayment(OrderService orderService){
            if(lock.tryLock()){ // locking payment
                try{
                    System.out.println("Payment service has initiated by "+
                            Thread.currentThread().getName());
                    System.out.println("Waiting for order conformation...");
                    Thread.sleep(3000);

                    if(orderService.lock.tryLock()){
                        try{
                            System.out.println("Order conformation received" +
                                    ", Payment completed.");
                            return; // exit when done
                        }finally {
                            orderService.lock.unlock(); // unlocking after order confirmed
                        }
                    }else{
                        System.out.println("Unable to acquire lock on order service.");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    lock.unlock(); // unlock when payment done
                }
            }else{
                System.out.println("Unable to acquire lock on Payment service.");
            }
    }
}