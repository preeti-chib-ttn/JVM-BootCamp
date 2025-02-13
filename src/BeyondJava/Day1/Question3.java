package BeyondJava.Day1;
import java.util.List;
import java.util.Map;
import java.util.Set;
/*Q3) Use Of method to create List, Set and Map
 */
public class Question3 {
    public static void main(String[] args) {
        // this can take value of also
        List<Integer> integers= List.of(Integer.valueOf(100),Integer.valueOf('1'-0));
        System.out.println(integers);
        // This can from an array of String return by split()
        Set<String> greetings= Set.of("Hello Namestey Hola".split(" "));
        System.out.println(greetings);
        // this can also be stated as usual
        Map<Integer,String> studentsRollno = Map.of(1,"Student1",2,"Student2");
        System.out.println(studentsRollno);
    }
}
