package JAVA.Tutorial.Recursion;

import java.util.Scanner;

public class PrintXpowN {
    public static int CalcPow(int x,int n){
        if(x==0){
            return 0;
        }if(n==0){
            return 1;
        }
        int xpownm1=CalcPow(x, n-1);
        int xpown=x*xpownm1;
        return xpown;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of x: ");
            int x=sc.nextInt();
            System.out.print("Enter the value of n: ");
            int n=sc.nextInt();
            int ans=CalcPow(x, n);
            System.out.println("The value of x to the power n is: "+ans);
        }
    }
}
