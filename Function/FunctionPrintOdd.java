package JAVA.Tutorial.Function;

import java.util.Scanner;

public class FunctionPrintOdd {
    public static void PrintOdd(int n){
        if(n%2 != 0){
            System.out.println("THE NUMBER IS ODD:");
        }else{
            System.out.println("THE NUMBER IS EVEN:");
        }
        return;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n: \n");
            int n=sc.nextInt();
        PrintOdd(n);
    }
}
}