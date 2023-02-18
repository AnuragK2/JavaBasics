package JAVA.Tutorial.BitsManipulation;

import java.util.Scanner;

public class BitManipulationSetBit {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n: ");
            int n=sc.nextInt();
            int pos=1;
            int bitmask=1<<pos;
            int NewNumber=bitmask | n;
            System.out.println("The new number is: "+NewNumber);
        }
    }
}
