package MultiThreading.Day1.Question2;

public class TicketCounter{
    private int totalTicket;
    public TicketCounter(int ticketCount){
        totalTicket=ticketCount;
    }

    public synchronized void buyTicket(String userName,int ticketCount){
        if(totalTicket<ticketCount){
            System.out.println("Sufficient Tickets not available for: "+userName);
            return;
        }
        try {
            System.out.println("Waiting to book your ticket: "+userName);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        totalTicket-=ticketCount;
        System.out.println(userName+" has booked "+ticketCount
                +" using TicketCounter(Thread): "
                +Thread.currentThread().getName());
    }

    public void getTotalTicket(){
         synchronized (this){
            System.out.println("The total number of tickets left are: "+totalTicket);
        }
    }

}