package JAVA.Tutorial.MathematicsAndNumberTheoryAlgo;

import java.util.Scanner;

public class FactorialOfno {
    public static int printfactorial(int n){
        int res=1;
        for(int i=2;i<=n;i++)
            res=res*i;
        return res;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n: ");
            int n=sc.nextInt();
            System.out.println("The factorial of "+n+ " is " +printfactorial(n));
        }
    }
}
