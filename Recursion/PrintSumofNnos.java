package JAVA.Tutorial.Recursion;
import java.util.Scanner;
public class PrintSumofNnos {
    public static void PrintSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.print("Sum is:"+sum);
            return;
        }
        sum+=i;
        PrintSum(i+1, n, sum);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n:");
            int n=sc.nextInt();
            PrintSum(1, n, 0);
        }
    }
}
