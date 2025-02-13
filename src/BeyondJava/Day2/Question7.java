package BeyondJava.Day2;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

/*
* Q7) Demonstrate the use of firstEntry(), lastEntry(),
* pollFirstEntry(), pollLastEntry(), putFirst(), putLast(),
* reversed() with SequencedMap.*/
public class Question7 {

    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new LinkedHashMap<>();
        map.putLast(2, "February");
        map.putFirst(1, "January");
        map.putLast(3, "March");

        System.out.println("Map: "+map);
        System.out.println("First Entry: "+map.firstEntry());
        System.out.println("Last Entry: "+map.lastEntry());

        map.pollFirstEntry();
        System.out.println("After pollFirstEntry(): "+map);

        map.pollLastEntry();
        System.out.println("After pollLastEntry(): "+map);
        map.putFirst(1, "January");
        System.out.println("Reversed Map: "+map.reversed());
    }
}
