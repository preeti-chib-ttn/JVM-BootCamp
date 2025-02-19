package MultiThreading.Day1.Question3;

public class Logger {
    private volatile boolean loggingActive = true;

    public void startLogging(String log) {
        System.out.println(Thread.currentThread().getName()
                +" logger in action...");
        while (loggingActive){
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(log);
       }
        System.out.println(Thread.currentThread().getName()
                +" logger in terminated.");
    }

    public void stopLogging() {
        loggingActive=false;
    }
}
