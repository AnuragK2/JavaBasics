package JAVA.Tutorial.LoopANDIfElse;

import java.util.Scanner;

public class tablen {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("\n Enter the value of n: ");
        int n=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(i*n);
        }
        }

    }
    
}