package BeyondJava.Day1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*Q4) Create Unmodifiable List from a Steam
 */
public class Question4 {
    public static void main(String[] args) {

        List<Integer> collect = IntStream.range(1, 11)
                .boxed().collect(Collectors.toUnmodifiableList());
        try{
            collect.add(20);
        }catch (UnsupportedOperationException e){
            System.out.println("Value canot be added, the list is:");
            for (Integer i : collect) System.out.print(i+" ");
        }

    }
}
