package Java8Features.Day2;

import java.util.*;
import java.util.Arrays;
import java.util.Optional;

/* Q4. Write a program to showcase the use of optional class. */
public class Question4 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,13,14,15,16,17,1,2,4,5);
        System.out.println("Optional with empty value:");
        // Empty
        Optional<Integer> optionalInteger = list.stream().filter(i->i<0).findAny();
        System.out.println(optionalInteger);
        // With elements
        System.out.println("Optional with integer value:");
        optionalInteger= list.stream().filter(i->i%2==0).findAny();
        System.out.println(optionalInteger);

    }
}
