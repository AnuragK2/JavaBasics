

import java.util.Scanner;

public class TwoDArrayPositionOfX {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int rows=sc.nextInt();
            int cols=sc.nextInt();
            int array[][]=new int[rows][cols];
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    array[i][j]=sc.nextInt();
                }
            }
            int x=sc.nextInt();
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(array[i][j]==x){
                    System.out.println("x found at location (" +i+ ","+j+")");
                    }
                }
            }
        }
    }
}
