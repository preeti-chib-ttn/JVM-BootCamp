package MultiThreading.Day1.Question3;
/* Q3) WAP to showcase the usage of volatile in java.
 */
public class Question3 {

    public static void main(String[] args) {
        Logger logger = new Logger();

        new Thread(()->logger.startLogging("A request sent from "+
                Thread.currentThread().getName())).start();

        new Thread(()->logger.startLogging("A request sent from "
                +Thread.currentThread().getName())).start();

        new Thread(()->logger.startLogging("A request sent from "
                +Thread.currentThread().getName())).start();

        new Thread(()->logger.startLogging("A request sent from "
                +Thread.currentThread().getName())).start();

        try {
            Thread.sleep(100);
            logger.stopLogging();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
