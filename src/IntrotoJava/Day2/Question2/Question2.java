
/*Q2. Create a User class with fields:  firstname, lastname, age, phone number.
Write a program which accepts values of user
fields from commandline, create objects and append that to a text file.
After every user creation the program should prompt:
"Do you want to continue creating users? (Type QUIT to exit)"
and keep on accepting values and writing to file until the user quits.*/
package IntrotoJava.Day2.Question2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Question2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);
             FileWriter fileWriter = new FileWriter("src/IntrotoJava/Day2/Question2/Text.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            boolean choice = true;

            do {
                System.out.println("First Name:");
                String firstname = scanner.nextLine();
                System.out.println("Last Name:");
                String lastname = scanner.nextLine();
                System.out.println("Age:");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Phone Number:");
                String phoneNumber = scanner.nextLine();

                User user = new User(firstname, lastname, age, phoneNumber);

                bufferedWriter.write(user.toString()+"\n");
                bufferedWriter.flush();
                System.out.println("Do you want to continue creating users? (Type QUIT to exit)");
                String quit = scanner.nextLine();
                choice = !quit.equalsIgnoreCase("QUIT");

            } while (choice);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
