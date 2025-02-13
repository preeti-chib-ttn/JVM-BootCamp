package BeyondJava.Day2;

/*Q4) Use a Sealed class Class concept to create a class hierarchy
 Q5)Mark Child classes as final, sealed, and non sealed and observe their behavior
*/

sealed class Parent permits Child1, Child2, Child3{
    void show(){
        System.out.println("Inside Parent class");
    }
}

final class Child1 extends Parent{
    void display(){
        System.out.println("Inside Child1 (final class)");
    }
}
sealed class Child2 extends  Parent permits Child4{
    void display(){
        System.out.println("Inside Child2 (sealed class)");
    }
}
non-sealed class Child3 extends  Parent{
    void display(){
        System.out.println("Inside Child3 (non-sealed class)");
    }
}
final class Child4 extends Child2{
    void display(){
        System.out.println("Inside Child4 (final subclass of Child2)");
    }
}

// Error as Child1 is final
//class SubChild1 extends Child1 {}

// Error as SubChild2 has no permission
//class SubChild2 extends Child2 {}

public class Question4_5 {
    public static void main(String[] args) {
        Parent p1 = new Child1();
        Parent p2 = new Child2();
        Parent p3 = new Child3();
        Parent p4 = new Child4();
        System.out.println("Parent Class Instances: ");
        p1.show();
        p2.show();
        p3.show();
        p4.show();

        System.out.println("\nSpecific Method Calls: ");
        ((Child1) p1).display();
        ((Child2) p2).display();
        ((Child3) p3).display();
        ((Child4) p4).display();
    }


}
