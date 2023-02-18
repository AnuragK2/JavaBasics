

import java.util.Scanner;

public class SpiralorderMatrix {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int Array[][]=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    Array[i][j]=sc.nextInt();
                }
            }
            System.out.println("The Spiral order matrix is: ");
            int rows_start=0;
            int row_end=n-1;
            int col_start=0;
            int col_end=m-1;
            while(rows_start<=row_end && col_start<=col_end){
                //1
                for(int col=col_start;col<=col_end;col++){
                    System.out.print(Array[rows_start][col]+" ");
                }
                rows_start++;
                //2
                for(int row=rows_start;row<=row_end;row++){
                    System.out.print(Array[row][col_end]+" ");
                }
                col_end--;
                //3
                for(int col=col_end; col>=col_start; col--) {
                    System.out.print(Array[row_end][col] + " ");
                }
                row_end--;
                //4
                for(int row=row_end; row>=rows_start; row--) {
                    System.out.print(Array[row][col_start] + " ");
                }
                col_start++;
       
                System.out.println();
      
                }
            }
        }
    }
