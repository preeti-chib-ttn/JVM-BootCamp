package IntrotoJava.Day1.Question8;
/* Q8. WAP to produce NoClassDefFoundError and ClassNotFoundException exceptions. */
public class ClassNotFoundExample {
    public static void main(String[] args) {
        try {
            // this class does not exist
            Class.forName("DoesNotExist");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e);
        }
    }
}
