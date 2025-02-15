package JavaCollections;
/*Q1. Write Java code to define List.
Insert 5 floating point numbers in List, and using an iterator,
find the sum of the numbers in List.*/
import java.util.*;

public class Question1 {

    public static void main(String[] args) {
        List<Float> floatList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 floating point number");
        for(int i=0;i<5;i++){
            Float f= scanner.nextFloat();
            floatList.add(f);
        }

        Iterator<Float> floatIterator= floatList.iterator();
        Float sum =0f;
        while(floatIterator.hasNext()){
            sum+= floatIterator.next();
        }

        System.out.println("The sum of entered number is: "+sum);


    }
}