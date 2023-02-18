package JAVA.Tutorial.BitsManipulation;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int i=0;
            double ans=0;
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            while(n!=0){
                int bit=n&1;
                ans=(bit*Math.pow(10,i))+ans;
                n=n>>1;
                i++;
            }
            System.out.println("The binary form is:"+ans);
        }
    }
}
