package JAVA.Tutorial.Strings;

import java.util.Scanner;

public class StringParseInt {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String str=sc.nextLine();
            int number=Integer.parseInt(str);
            System.out.println(number);
        }
            }
         
    }