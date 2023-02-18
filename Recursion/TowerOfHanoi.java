package JAVA.Tutorial.Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void PrintTowerOfHanoi(int n, String src, String help, String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        PrintTowerOfHanoi(n-1, src, dest, help);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        PrintTowerOfHanoi(n-1, help, src, dest);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of disks: ");
            int n=sc.nextInt();
            PrintTowerOfHanoi(n, "S", "H", "D");
        }
    }
}
