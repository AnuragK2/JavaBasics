package JAVA.Tutorial.BitsManipulation;

import java.util.Scanner;

public class BitManipulationUpdateBit {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n: ");
            int n=sc.nextInt();
            System.out.print("Enter the operation to be held: ");
            int operation=sc.nextInt();
            int pos=1;
            if(operation==1){
                int BitMask=1<<pos;
                int NewNumber=BitMask | n;
                System.out.println("The new number after using set operation to update to 1 is: "+NewNumber);
            }else if(operation==0){
              int BitMask=1<<pos;
              int NotBitMask=~BitMask;
              int NewNumber=NotBitMask & n;
              System.out.println("The new number after using clear operation to update to 0 is: "+NewNumber);  
            }
        }
    }
}
