package IntrotoJava.Day1;

/* WAP showing try, multi-catch and finally blocks.
 */
public class Question7 {
    public static void  main(String[] args){

        try{
            String y = "hello";
            int x = Integer.parseInt(y);
            int z=0;
            x= 4/z;
        }catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }finally {
            System.out.println("This is finally block.");
        }
    }
}
