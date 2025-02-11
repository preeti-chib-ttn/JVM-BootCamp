package Java8Features.Day2;

import java.util.*;
/* Sum all the numbers greater than 5 in the integer list using streams */
public class Question3 {

    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,3,4,5,6,7,8,20);
        System.out.println("The numbers greater than 5 are:");
        integerList.stream().filter(i->i>5).map(i->i+" ")
                .forEach(System.out::print);

    }
}
