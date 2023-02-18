package JAVA.Tutorial.Function;

import java.util.Scanner;

public class functionBasic {
    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the name: ");
            String name=sc.next();
            PrintMyName(name);
        }
    }
}
