package BeyondJava.Day1;

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

/*Q2) Convert an Optional type into Stream
 * */
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string= sc.nextLine();
        Optional<String> stringOptional = Optional.of(string.strip());
        stringOptional.stream()
                .flatMap(str-> Stream.of(str.split(" ")))
                .forEach(System.out::println);
    }
}

