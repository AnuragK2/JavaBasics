package JAVA.Tutorial.Strings;

import java.util.Scanner;

public class StringSubstring {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string:");
            String sentence=sc.nextLine();
            String name=sentence.substring(3,sentence.length());
            System.out.println("The substring is: "+name);
        }
    }
}
