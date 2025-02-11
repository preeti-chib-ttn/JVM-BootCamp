package Java8Features.Day2;
import java.util.*;
import java.util.function.*;

/*Implement following functional interfaces from
    java.util.function using lambdas:
    1. Consumer 2. Supplier 3. Predicate 4. Function */
public  class Question1 {

    public static void main(String[] args) {
        Consumer<List<Integer>> listConsumer = (a)-> System.out.println("The list is: "+Arrays.toString(a.toArray()));

        Supplier<List<Integer>> listSupplier = ()->{
            System.out.println("Changing values in the list to (1,2,3,4,5,6) ");
            return Arrays.asList(1,2,3,4,5,6);
        };

        Predicate<Integer> isEven = i->i%2==0;

        Function<List<Integer>,Integer> sumListElement = (list)->{
            int sum=0;
            for(Integer a: list) sum+=a;
            return sum;
        };

        List<Integer> anIntegerList = Arrays.asList(23,12,15,11,16,17,18);
        // use of consumer to print List
        listConsumer.accept(anIntegerList);
        // use of supplier
        anIntegerList=listSupplier.get();
        listConsumer.accept(anIntegerList);
        // use of predicate to print even number
        System.out.println("The even integers of the list are as: ");
        for(Integer i: anIntegerList){
            if(isEven.test(i)) System.out.print(i+" ");
        }
        // use of function to get sum of all element of list
        System.out.println("\nThe sum of all elements of the list are: "+sumListElement.apply(anIntegerList));
    }
}