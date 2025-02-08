package IntrotoJava.Day2.Question3;
/*Q3. Write a program to count the number of occurrences of a word in a file.
The file name and word should be supplied through commandline.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        if(args.length<2){
            System.out.println("File name and word are missing in the arguments");
            System.exit(1);
        }

        String filePath= args[0];
        String word= args[1];
        int wordOccurence=0;
        try(Scanner fileScanner = new Scanner(new File(filePath))){

            while(fileScanner.hasNext()){

                if(fileScanner.next().equalsIgnoreCase(word))
                    wordOccurence++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }

        System.out.println("The number of occurences of "+word+" is: "+wordOccurence);
    }

}
