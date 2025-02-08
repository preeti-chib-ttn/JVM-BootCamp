package IntrotoJava.Day1;/* Q4.Create a two-dimensional array of integers and display:
1. sum of all elements of each column 
2. sum of all elements of each row
*/
import java.util.Scanner;
public class Question4 {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m= scanner.nextInt();
        System.out.println("Enter the number of columns");
        int n= scanner.nextInt();
        int[][] mat= new int[m][n];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]= scanner.nextInt();
            }
        }

        System.out.println("Entered matrix is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<m;i++){
            int rowSum=0, colSum=0;

            for(int j=0;j<n;j++){
                rowSum+= mat[i][j];
                colSum+=mat[j][i];
            }

            System.out.println("The sum of the row "+i+" is: "+ rowSum);
            System.out.println("The sum of the col "+i+" is: "+ colSum);
        }
    }
}
