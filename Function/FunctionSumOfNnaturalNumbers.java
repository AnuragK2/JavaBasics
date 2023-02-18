package JAVA.Tutorial.Function;

import java.util.Scanner;

public class FunctionSumOfNnaturalNumbers {
    public static void sum(int n){
        int ans=0;
        for(int i=0;i<=n;i++){
            ans+=i;
        }
        System.out.println("The sum is: "+ans);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n: ");
            int n=sc.nextInt();
            sum(n);
        }
    }
}
