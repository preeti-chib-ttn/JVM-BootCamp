package IntrotoJava.Day1;/* Write a java program to show following menu to the user:
*******Menu*******
1. Calculate Area of Circle
2. Calculate Circumference of a Circle
3. Exit.
Choose an option (1-3):
Take radius as user input. Area and circumference methods should be static
*/

import java.util.Scanner;


public class Question3 {
    static double area(double radius){
        return Math.PI*radius*radius;
    }
    static  double circumference(double radius){
        return 2*Math.PI*radius;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice=0;
        System.out.println("*******Menu*******");
        System.out.println("1. Calculate Area of Circle\n" +
                "2. Calculate Circumference of a Circle\n" +
                "3. Exit.");
        while (choice!=3){
            System.out.println("Choose an option (1-3):");
            choice= scanner.nextInt();
            double radius=0.0;
            if(choice==1 || choice==2){
                System.out.println("Enter the radius:");
                radius=scanner.nextDouble();
            }
            switch (choice){
                case 1:
                    System.out.printf("The Area of Circle is: %.4f%n",area(radius));
                    break;
                case 2:
                    System.out.printf("The Circumference of Circle is: %.4f%n",circumference(radius));
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid option between (1-3).");
            }
        }
    }

}
