package JAVA.Tutorial.Function;

import java.util.Scanner;

public class FunctionPower {
    public static void PrintPower(int x,int n){
        int result=1;
        for(int i=0;i<=n;i++){
            result=result*x;
        }
        System.out.println("x to the power n is: "+result);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of x: ");
            int x=sc.nextInt();
            System.out.print("Enter the value of n: ");
            int n=sc.nextInt();
            PrintPower(x, n);
        }
        }
}
