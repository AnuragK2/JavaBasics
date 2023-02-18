package JAVA.Tutorial.BitsManipulation;

import java.util.Scanner;

public class BitManipulationGetBit {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n: ");
            int n=sc.nextInt();
            int pos=3;
            int bitMask=1<<pos;
            if((bitMask & n)==0){
                System.out.println("Bit was zero.");
            }else{
                System.out.println("Bit was one.");
            }
        }
    }
}
