package JAVA.Tutorial.BitsManipulation;

import java.util.Scanner;

public class NoOfBITStoChangeTOConvertAtoB {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of A: ");
            int a=sc.nextInt();
            System.out.println("Enter the value of B: ");
            int b=sc.nextInt();
            /*int pos=1;
            int count=0;
            int n=a^b;
            while(n!=0){                                                                             //APPROACH 1
                count+=n&1;                                 
                n>>=pos;           
            }
            System.out.println("The number of bits to change to convert A to B is: "+count);
            */ 
            int count =0;
            int n=a^b;
            while(n!=0){                                                                             //APPROACH 2
            n=n&(n-1);
            count++;
            }
            System.out.println("The number of bits to change to convert A to B is: "+count);
        }
    }
}
