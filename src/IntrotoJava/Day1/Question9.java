package IntrotoJava.Day1;

/* Q9. Create a custom exception that does not have any stack trace.
 */
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this; // this line makes the stack trace empty.
    }
}
public class Question9 {

    public static void main(String[] args){
        try{
            throw new CustomException("IntrotoJava.Day1.CustomException occurred with no trace.");
        }catch (CustomException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
        }
    }



}
