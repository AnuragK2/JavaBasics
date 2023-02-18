package JAVA.Tutorial.Recursion;
import java.util.Scanner;
public class PrintNos1to5 {
    public static void PrintNo(int n){
        if(n==6){
            return;
        }
        System.out.println("Desired output is:"+n);
        PrintNo(n+1);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n:");
            int n=sc.nextInt();
            PrintNo(n);
        }
    }
}
