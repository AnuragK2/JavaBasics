package JAVA.Tutorial.Function;

import java.util.Scanner;

public class FunctionBigger {
    public static void BiggerOf2(int a,int b){
        if(a>b){
            System.out.println("A is Bigger than B ");
        }
        else{
            System.out.println("B is Bigger than A ");
        }
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of A:");
            int a=sc.nextInt();
            System.out.println("Enter the value of B:");
            int b=sc.nextInt();
            BiggerOf2(a, b);
        }
    }
}
