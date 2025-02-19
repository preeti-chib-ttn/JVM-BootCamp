package MultiThreading.Day1.Question4;
/*
Q4) Write a code to simulate a deadlock in java
 */
public class Question4 {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        Thread orderServiceThread = new Thread(
                ()-> orderService.placeOrder(paymentService));
        Thread paymentServiceThread = new Thread(
                ()-> paymentService.completePayment(orderService));

        orderServiceThread.start();
        paymentServiceThread.start();
    }
}
