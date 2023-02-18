package JAVA.Tutorial.Recursion;

import java.util.Scanner;

public class PrintFibonacciSeriesTillN {
    public static void FibonacciSeries(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        FibonacciSeries(b, c, n-1);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n: ");
            int n=sc.nextInt();
            int a=0,b=1;
            System.out.println(a);
            System.out.println(b);
            FibonacciSeries(a, b, n-2);
        }
    }
}
