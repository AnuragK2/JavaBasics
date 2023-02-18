package JAVA.Tutorial.Function;

import java.util.Scanner;

public class FunctionSum {
    public static int CalculateSum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number 1: \n");
            int a=sc.nextInt();
            System.out.print("Enter the number 2: \n");
            int b=sc.nextInt();
            int sum=CalculateSum(a, b);
            System.out.println("Sum of two numbers is: \n" +sum);
        }
    }
}
