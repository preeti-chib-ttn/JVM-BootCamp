package Java8Features.Day1;
/*Q2) Using (instance) Method reference create
 and apply add and subtract method and
 using (Static) Method reference create and
 apply multiplication method for the functional interface created.*/


interface MethodReferenceDemo{

    int operate(int a,int b);
}

class Operation {

   int add(int a, int b){
       return  a+b;
   }
    int sub(int a, int b){
        return  a-b;
    }
    static int mul(int a, int b){
        return  a*b;
    }

}

public class Question2 {

    public static void main(String[] args) {
        Operation operator = new Operation();
        MethodReferenceDemo addition = operator::add;
        MethodReferenceDemo subtraction = operator::add;
        System.out.println("The addition of numbers using Method Instance Reference is: "+addition.operate(10,20));
        System.out.println("The addition of numbers using Method Instance Reference is: "+subtraction.operate(100,20));
        MethodReferenceDemo multiplication = Operation::mul;
        System.out.println("The multiplication of numbers using Method Static Reference is: "+multiplication.operate(8,5));
    }
}
