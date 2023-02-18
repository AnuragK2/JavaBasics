package JAVA.Tutorial.Strings;

import java.util.Scanner;

public class StringToString {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int x=sc.nextInt();
            String str=Integer.toString(x);
            System.out.println(str.length());
        }
    }
}
