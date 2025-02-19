package MultiThreading.Day1.Question4;

public class OrderService {

    public synchronized void placeOrder(PaymentService paymentService){
        System.out.println(Thread.currentThread().getName()+" has placed order.");

        try {
            Thread.sleep(3000);
            System.out.println("Waiting for payment service...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (paymentService){
            System.out.println("Payment Service executed by "
                    +Thread.currentThread().getName());
        }
    }
}
