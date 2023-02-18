package JAVA.Tutorial.Pattern;

import java.util.Scanner;

public class Pattern01Triangle{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value off n: ");
            int n=sc.nextInt();
            for(int i=0;i<=n;i++){
                for(int j=1;j<=i;j++){
                    int sum=i+j;
                    if(sum%2==0){
                        System.out.print(" 1 ");
                    }else
                    System.out.print(" 0 ");
                }
                System.out.println();
            }
        }
    }
}
