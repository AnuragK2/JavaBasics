package JAVA.Tutorial.Recursion;

import java.util.Scanner;

public class PrintFactorial {
    public static int calcFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1=calcFactorial(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n: ");
            int n=sc.nextInt();
            int ans=calcFactorial(n);
            System.out.println("The factorial is:"+ans);
        }
    }
}
