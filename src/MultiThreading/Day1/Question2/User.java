package MultiThreading.Day1.Question2;

public class User implements Runnable{
    String userName;
    TicketCounter ticketCounter;
    int ticketBooked;

    User(String name,TicketCounter counter,int tickets){
        userName=name;
        ticketCounter=counter;
        ticketBooked=tickets;
    }

    @Override
    public void run(){
        ticketCounter.buyTicket(userName,ticketBooked);
    }
}
