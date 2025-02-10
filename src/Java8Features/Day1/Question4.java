package Java8Features.Day1;
/* Write a program to implement constructor reference*/
interface DemoInteface{
    Test functiondemo(int a);
}
class Test{
    int test;
    Test(int a){
        test=a;
    }

    void gettest(){
        System.out.println("The value of test is: "+test);
    }
}

public class Question4 {
    public static void main(String[] args) {
        // constructor reference
        DemoInteface demo = Test::new;
        demo.functiondemo(34).gettest();
    }
}
