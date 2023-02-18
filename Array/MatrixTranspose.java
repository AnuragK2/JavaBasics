

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int rows=sc.nextInt();
            System.out.println("Enter the number of columns: ");
            int cols=sc.nextInt();
            int Array[][]=new int[rows][cols];
            System.out.println("Enter the array elements: ");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    Array[i][j]=sc.nextInt();
                }
            }
        System.out.println("The transpose of the matrix is: ");
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
}
