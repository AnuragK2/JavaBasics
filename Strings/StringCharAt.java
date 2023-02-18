package JAVA.Tutorial.Strings;

import java.util.*;

public class StringCharAt{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the First Name: ");
            String fname=sc.next();
            System.out.println("Enter the Last Name: ");
            String lname=sc.next();
            String fullname= fname +" "+ lname;
            for(int i=0;i<=fullname.length();i++){
                System.out.println("The characters are: "+fullname.charAt(i));
            }
        }
    }
}