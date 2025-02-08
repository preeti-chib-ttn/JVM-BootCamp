package IntrotoJava.Day2.Question1;
/*Q1. Write a program to display values of enums
using a constructor & getPrice() method
(Example display house & their prices)*/
enum Houses{
    SEAFACING(100000),
    COTTAGE(10000),
    VILLA(232000);


    private final int price;
    Houses(int price){
        this.price=price;
    }

    public int getPrice(){
        return price;
    }

}
public class Question1 {
    public static void main(String[] args) {

        for(Houses h: Houses.values()){
            System.out.println("The price of "+h+" is: "+h.getPrice());
        }
    }
}