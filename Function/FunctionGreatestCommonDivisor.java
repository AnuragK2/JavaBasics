package JAVA.Tutorial.Function;

import java.util.Scanner;

public class FunctionGreatestCommonDivisor {
    public static void PrintGreatestCommonDivisor(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        System.out.println("Greatest Common Divisor is: "+b);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the 1st number: ");
            int a=sc.nextInt();
            System.out.println("Enter the 2nd number: ");
            int b=sc.nextInt();
            PrintGreatestCommonDivisor(a, b);
        }
    }
}