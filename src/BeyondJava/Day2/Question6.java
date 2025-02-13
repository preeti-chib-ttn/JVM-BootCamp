package BeyondJava.Day2;
/*
* Q6) Demonstrate the use of
* addFirst(), addLast, removeFirst(), removeLast,
* getFirst(), getLast(), reversed() in
* Set and List Sequenced collections*/

import java.util.LinkedList;
import java.util.SequencedCollection;

public class Question6 {
    public static void main(String[] args) {
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
    }
}
