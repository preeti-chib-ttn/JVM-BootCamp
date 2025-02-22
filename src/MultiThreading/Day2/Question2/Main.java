package MultiThreading.Day2.Question2;

/* Q2) Improve the code written in Basics of Multi Threading Part 1
 exercise question 4 to handle the deadlock using reentrant lock.*/
public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        System.out.println("The lock are applied in reverse in this example." +
                "\n[ tryLock() is used to prevent deadlock ]\n");
        Thread orderServiceThread = new Thread(
                ()-> orderService.placeOrder(paymentService));
        Thread paymentServiceThread = new Thread(
                ()-> paymentService.completePayment(orderService));

        orderServiceThread.start();
        paymentServiceThread.start();
    }
}