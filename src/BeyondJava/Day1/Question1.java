package BeyondJava.Day1;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
* Q1) Use iterator stream method to generate a stream*/
public class Question1 {

    public static void main(String[] args) {
        System.out.println("Enter  a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The powers of the given number is: ");
        IntStream.iterate(1,i->i<50,i->i*n).forEach(System.out::println);
    }
}
