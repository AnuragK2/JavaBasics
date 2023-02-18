package JAVA.Tutorial.BitsManipulation;

import java.util.Scanner;

public class BitManipulationClearBit {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n: ");
            int n=sc.nextInt();
            int pos=2;
            int BitMask=1<<pos;
            int NotBitMask=~(BitMask);
            int NewNumber=NotBitMask & n;
            System.out.println("The New Number after clearing bit: "+NewNumber);
        }
    }
}
