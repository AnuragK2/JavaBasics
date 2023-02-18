package JAVA.Tutorial.LoopANDIfElse;

import java.util.Scanner;

public class marksSwitchLoop {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int input;

            do{
                int marks=sc.nextInt();
                if(marks>=90 && marks<=100)
                {
                    System.out.println("\n This is good");
                }
                else if(marks>=60 && marks<=89){
                    System.out.println("\n This is also good");
                }
                else if(marks>=0 && marks<=59){
                    System.out.println("\n This is good as well");
                }
                else
                {
                    System.out.println("\n Invalid!!!!");
                }
                System.out.println("\n Want to continue? (yes(1) or No(0))");
                input=sc.nextInt();
            }while(input==1);
        }
    }
    
}
