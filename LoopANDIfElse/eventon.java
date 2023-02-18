package JAVA.Tutorial.LoopANDIfElse;

import java.util.Scanner;

public class eventon {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n Enter the value of n");
            int n=sc.nextInt();
            for(int i=0;i<=n;i++){
                if(i%2==0)
                System.out.println(i);
            }
        }

    }
}
