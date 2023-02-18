package JAVA.Tutorial.BitsManipulation;

import java.util.Scanner;

public class DecimalToBinaryNegativeNo {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n=sc.nextInt();
            n=(~n)+1;
            System.out.println("The number is:"+n);
            int i=0;
            double ans=0;
            while(n!=0){
                int bit=n&1;
                ans=(bit*Math.pow(10, i))+ans;
                n=n>>1;
                i++;
            }
            System.out.println("The decimal number is: "+ans);
        }
    }
}
