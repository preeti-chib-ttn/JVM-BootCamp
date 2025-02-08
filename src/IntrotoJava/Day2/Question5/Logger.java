/* Q5. Write a program to show application of Singleton Design Pattern.
 */
package IntrotoJava.Day2.Question5;

public class Logger {

    static Logger logInstance;

    private Logger(){}

    public void printLog(String log){
        System.out.println(log);
    }
    public static Logger getInstance(){

        if (logInstance == null) {
            logInstance= new Logger();
        }

        return logInstance;
    }
}
