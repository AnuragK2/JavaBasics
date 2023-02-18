package JAVA.Tutorial.Recursion;

import java.util.Scanner;

public class PrintNos5to1 {
    public static void printNo(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNo(n-1);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n:");
            int n=sc.nextInt();
            printNo(n);
        }
    }
}
