package MultiThreading.Day1.Question2;

/*Q2) Use Synchronize method and synchronize block to enable
synchronization between multiple threads trying to access
method at same time.
 */

public class Question2 {
    public static void main(String[] args) {
        TicketCounter counter= new TicketCounter(200);
        User userA = new User("Ram",counter,100);
        User userB = new User("Raman",counter,50);
        User userC = new User("Priya",counter,30);
        User userD= new User("Sakshi",counter,30);

        Thread userAThread= new Thread(userA);
        Thread userBThread= new Thread(userB);
        Thread userCThread= new Thread(userC);
        Thread userDThread= new Thread(userD);
        Thread updateThread = new Thread(() -> {
            try {
                for(int i=0;i<3;i++){
                    Thread.sleep(1000);
                    counter.getTotalTicket();
                }
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        updateThread.start(); // give updates of the counter.
        userAThread.start();
        userBThread.start();
        userCThread.start();
        userDThread.start();
    }
}
