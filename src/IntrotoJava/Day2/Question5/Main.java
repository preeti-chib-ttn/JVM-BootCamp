package IntrotoJava.Day2.Question5;

public class Main {

    public static void main(String[] args) {
        Logger dbApp = Logger.getInstance();
        dbApp.printLog("Database Log Message");

        Logger webApp = Logger.getInstance();
        webApp.printLog("Website Log Message");
    }
}
