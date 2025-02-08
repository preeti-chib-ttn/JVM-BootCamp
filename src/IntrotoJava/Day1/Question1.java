package IntrotoJava.Day1;

/*Q1. Write a class with FirstName, LastName & age field.
    Print Firstname, LastName & age using static block,
    static method & static variable respectively.
*/
public class Question1 {
    static String firstName;
    static String lastName;
    static int age;
    static {
        firstName="Java";
        lastName="Developer";
        age=23;
        // print using static block
        System.out.println("Inside Static block");
        System.out.println(firstName+" "+lastName+" "+age);
    }

    // print using static function
    static void printDetails(){
        System.out.println("Inside Static function");
        System.out.println(firstName+" "+lastName+" "+age);
    }

    public static void main(String[] args) {
        Question1.printDetails();
       // print using static variables
        System.out.println("Inside main function");
        System.out.println(Question1.firstName+" "+Question1.lastName+" "+Question1.age);
    }
}