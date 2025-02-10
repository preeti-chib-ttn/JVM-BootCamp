
/* Q1) Write the following functional interface and implement it using lambda:
 1. To check whether the first number is greater than the second number or not,
  Parameter (int ,int ) Return type boolean
  2. Increment the number by 1 and return incremented value
  Parameter (int) Return int
  3. Concatenation of 2 string
  Parameter (String , String ) Return (String)
  4. Convert a string to uppercase and return .
  Parameter (String) Return (String)
 */

package Java8Features.Day1;
interface  CompareNumbers{
    public boolean compareNumbers(int a, int b);
}

interface IncrementNumber{
    public int incrementNumber(int a);
}

interface ConcatenateString{
    public String concatenateString(String a, String b);

    public static void printString(ConcatenateString concatenateString){
        System.out.println("The string is "+concatenateString.concatenateString("Hello ","World!"));
    }
}

interface  ChangeCaseString{
    public String changeCase(String string);
}

public class Question1 {
    public static void main(String[] args) {

        // To check whether the first number is greater than the second number or not
        CompareNumbers greaterNumber=(a,b)-> (a>b);
        System.out.println("Is 10 greater than 20: "
                +greaterNumber.compareNumbers(10,20));

        // Increment the number by 1 and return incremented value
        System.out.println("The increament of 10 is: " +
                ((IncrementNumber) (a)-> a+1 )
                        .incrementNumber(10));
        //  Concatenation of 2 String
        ConcatenateString.printString( (a,b)-> (a+b));
        // Convert a string to uppercase and return .
        System.out.println("Converting string to upper case: "+
                ((ChangeCaseString)(a)-> a.toUpperCase())
                        .changeCase("a random string"));

    }

}
