package JAVA.Tutorial.Function;

import java.util.*;

public class FunctionVote {
    public static void PrintVote(int age){
        if(age>18){
            System.out.println("The Person is eligible for voting");
        }
        else{
            System.out.println("The Person is not eligible for voting");
        }
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the age of the Person:");
            int age=sc.nextInt();
            PrintVote(age);
        }
    }
}
