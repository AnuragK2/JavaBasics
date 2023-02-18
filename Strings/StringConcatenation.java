package JAVA.Tutorial.Strings;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the First Name: ");
            String fname=sc.next();
            System.out.println("Enter the Last Name: ");
            String lname=sc.next();
            String fullname= fname +" "+ lname;
            System.out.println("The full name is: "+fullname);
        }
    }
}
