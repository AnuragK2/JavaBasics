package JAVA.Tutorial.Function;

import java.util.Scanner;

public class FunctionSumOdd {
    public static void PrintSumOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2 !=0){
            sum=sum+i;
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n: ");
            int n=sc.nextInt();
            PrintSumOdd(n);
        }
    }
}
