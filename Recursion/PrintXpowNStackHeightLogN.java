package JAVA.Tutorial.Recursion;

import java.util.Scanner;

public class PrintXpowNStackHeightLogN {
    public static int CalcPow(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        //for even
        if(n%2==0){
            return CalcPow(x, n/2)*CalcPow(x, n/2);
        }
        //for odd
        else{
            return CalcPow(x, n/2)*CalcPow(x, n/2)*x;
        }
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of x: ");
            int x=sc.nextInt();
            System.out.print("Enter the value of n: ");
            int n=sc.nextInt();
            int ans=CalcPow(x, n);
            System.out.print("The value of x to the power n using log n approach is: "+ans);
        }
    }
}
