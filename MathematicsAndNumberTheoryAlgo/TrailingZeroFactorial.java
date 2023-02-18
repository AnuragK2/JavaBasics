package JAVA.Tutorial.MathematicsAndNumberTheoryAlgo;

import java.util.Scanner;

public class TrailingZeroFactorial {
    public static int printTrailingZero(int n){
        int count=0;
        for(int i=5;i<=n;i=i*5){
            count=count+n/i;
        }
        return count;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n: ");
            int n=sc.nextInt();
            System.out.println("Count of trailing 0s in " + n+ "! is "+printTrailingZero(n));
        }
    }
}
