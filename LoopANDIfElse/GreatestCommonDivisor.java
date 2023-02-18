package JAVA.Tutorial.LoopANDIfElse;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the 1st number: ");
            int a=sc.nextInt();
            System.out.println("Enter the 2nd number: ");
            int b=sc.nextInt();
            while(a!=b){
                if(a>b){
                    a=a-b;
                }else{
                    b=b-a;
                }
            }
            System.out.println("Greatest Common Divisor is: "+b);
        }
    }
}
