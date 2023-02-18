package JAVA.Tutorial.Function;

import java.util.Scanner;

public class FunctionProduct {
    public static int CalculateProduct(int a,int b){
        int Product=a*b;
        return Product;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of 1st number: \n");
            int a=sc.nextInt();
            System.out.print("Enter the value of 2nd number: \n");
            int b=sc.nextInt();
            int Product=(CalculateProduct(a, b));
            System.out.println("The product of two numbers is: \n" +Product);
        }
    }
}
