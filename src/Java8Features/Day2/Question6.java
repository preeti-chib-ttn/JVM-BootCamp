package Java8Features.Day2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/* Using java 8 date/time api:
1. WAP to get two dates from the user and print if the first date occurs before or after the second date supplied by the user.
2. WAP to print current date and time in 3 different time zones.
*/
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Enter first date (dd-MM-yyyy) : ");
        String firstDateStr = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateStr, formatter);
        System.out.println("Enter second date (dd-MM-yyyy):");
        String secondDateStr = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateStr, formatter);

        if(firstDate.isBefore(secondDate)){
            System.out.println("First date entered "+firstDate +" comes before 2nd date entered.");
        }else{
            System.out.println("Second date entered "+secondDate +" comes before Ist date entered.");
        }


        ZonedDateTime kolkataTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime parisTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy hh:mm:ss a z(Z)");
        System.out.println("India (Kolkata) time : " + kolkataTime.format(format));
        System.out.println("France (Paris) time : " + parisTime.format(format));
        System.out.println("Japan (Tokyo) time : " + tokyoTime.format(format));
    }
}
