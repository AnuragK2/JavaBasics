package JAVA.Tutorial.MathematicsAndNumberTheoryAlgo;

import java.util.Scanner;

public class EuclidGCD {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number 1: ");
            int a=sc.nextInt();
            System.out.println("Enter the number 2: ");
            int b=sc.nextInt();
            System.out.println("GCD of the numbers are:" +gcd(a,b));
        }
    }
    public static int gcd(int a,int b){
        if(b==0)
        return a;
        return gcd(b, a%b);
    }
}
