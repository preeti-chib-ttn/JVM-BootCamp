package BeyondJava.Day2;
/*
* Q6) Demonstrate the use of
* addFirst(), addLast, removeFirst(), removeLast,
* getFirst(), getLast(), reversed() in
* Set and List Sequenced collections*/

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.SequencedCollection;
import java.util.SequencedSet;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("-----Sequenced List Operations-----");
        SequencedCollection<String> list = new LinkedList<>();
        list.addFirst("Kiwi");
        list.addLast("Orange");
        list.addLast("Cherry");
        list.addFirst("Apple");
        System.out.println("List: "+list);
        System.out.println("First Element: "+list.getFirst());
        System.out.println("Last Element: "+list.getLast());
        list.removeFirst();
        System.out.println("After removeFirst(): "+list);
        list.removeLast();
        System.out.println("After removeLast(): "+list);
        System.out.println("Reversed List: "+list.reversed());


        System.out.println("-----Sequenced Set Operations-----");
        SequencedSet<String> set = new LinkedHashSet<>();

        set.addFirst("Strawberry");
        set.addLast("Butterscotch");
        set.addLast("Cotton Candy");
        set.addLast("Cotton Candy");

        System.out.println("Set: "+set);
        System.out.println("First Element: "+set.getFirst());
        System.out.println("Last Element: "+set.getLast());
        set.removeFirst();
        System.out.println("After removeFirst(): "+set);
        set.removeLast();
        System.out.println("After removeLast(): "+set);
        set.addFirst("Chocolate");
        System.out.println("Reversed Set: "+set.reversed());
    }
}
