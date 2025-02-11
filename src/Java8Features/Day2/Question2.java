package Java8Features.Day2;
/*Q2. Create and access default and static methods of an interface.
 */

interface MyInterface{

    default void defaultFunction(){
        System.out.println("This is a default function.");
    }

    static void staticFunction(){
        System.out.println("This is a static function. ");
    }

}
public class Question2 {
    public static void main(String[] args) {

        MyInterface myInterface= new MyInterface() {
            public void defaultFunction() {
                System.out.println("This interface is called by interface reference.");
                MyInterface.super.defaultFunction();
            }
        };
        myInterface.defaultFunction();
        System.out.println("This static function is called by Interface name");
        MyInterface.staticFunction();
    }
}
