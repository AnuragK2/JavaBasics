package JAVA.Tutorial.Function;

import java.util.Scanner;

public class Function3Average {
    public static int Average(int a, int b, int c){
        int sum=a+b+c;
        int avg=sum/3;
        return avg;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the 1st number: \n");
            int a=sc.nextInt();
            System.out.print("Enter the 2nd number: \n");
            int b=sc.nextInt();
            System.out.print("Enter the 3rd number: \n");
            int c=sc.nextInt();
            System.out.println("The average of 3 numbers is: \n" +Average(a, b, c));
        }

    }
}
