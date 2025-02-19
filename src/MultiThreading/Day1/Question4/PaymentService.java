package MultiThreading.Day1.Question4;

public class PaymentService{

   public synchronized void completePayment(OrderService orderService){
       System.out.println("Payment service has initiated by "+
               Thread.currentThread().getName());

       try {
           System.out.println("Waiting for order conformation...");
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

       synchronized (orderService){
           System.out.println("Order conformation received" +
                   ", Payment completed.");
       }
   }
}
