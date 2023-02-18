package JAVA.Tutorial.Strings;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the String 1: ");
            String name1=sc.next();
            System.out.println("Enter the String 2: ");
            String name2=sc.next();
            if(name1.compareTo(name2)==0){
                System.out.println("The strings are equal.");
            }else if(name1.compareTo(name2)>0){
                System.out.println("The string 1 is greater.");
            }else{
                System.out.println("The string 2 is greater.");
            }
        }
    }
}
