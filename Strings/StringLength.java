package JAVA.Tutorial.Strings;

import java.util.*;

public class StringLength {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the First Name: ");
            String fname=sc.next();
            System.out.println("Enter the Last Name: ");
            String lname=sc.next();
            String fullname= fname +" "+ lname;
            System.out.println("The length of full name is: "+fullname.length());
        }
    }
}
