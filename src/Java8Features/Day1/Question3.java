package Java8Features.Day1;

/*Implement multiple inheritance with default method inside interface.*/

interface Parent1 {
    default void demo(){
        System.out.println("Inside interface Parent 1");
    }
}

interface Parent2 {
    default void demo(){
        System.out.println("Inside interface Parent 2");
    }
}

// multiple inheritance
class  Child implements  Parent1,Parent2{
    // implementation of demo is compulsory here
    public void  demo(){
        Parent1.super.demo();
        Parent2.super.demo();
        System.out.println("Inside interface Child");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Child child= new Child();
        child.demo();
    }
}
