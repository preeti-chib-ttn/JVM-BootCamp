package IntrotoJava.Day1;/* Q2. Write a program to read user input until the user writes
    XDONE and then show the entered text by the user on command line.*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){


        StringBuilder finalInputString = new StringBuilder();
        Scanner scanner= new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.equals("XDONE")) break;

            finalInputString.append(input).append("\n");
        }

        System.out.println(finalInputString);
        
    }
}
