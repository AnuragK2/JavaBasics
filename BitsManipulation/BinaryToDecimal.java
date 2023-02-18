package JAVA.Tutorial.BitsManipulation;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the binary number: ");
            int n=sc.nextInt();
            int i=0;
            double ans=0;
            while(n!=0){
                int digit=n%10;
                if(digit==1){
                    ans=ans+Math.pow(2,i);
                }
                n=n/10;
                i++;
            }
            System.out.println("The decimal number is: "+ans);
        }
    }
}
