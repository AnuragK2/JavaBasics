package JAVA.Tutorial.MathematicsAndNumberTheoryAlgo;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int r, temp, sum=0;
            System.out.println("Enter the number: ");
            int n=sc.nextInt();
            temp=n;
            while(n>0){
                r=n%10;
                sum=(sum%10)+r;
                n=n/10;
            }
        if(temp==sum)
            {System.out.println("The number is palindrome ");}
        else
                System.out.println("The number is not palindrome ");
        }
    }
}
