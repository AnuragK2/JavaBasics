package JAVA.Tutorial.Function;

import java.util.Scanner;

public class FunctionCircumference {
    public static void PrintCircumference(Double r){
        double circum=2*3.14*r;
        System.out.println("The circumference of circle is:"+circum);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
        
        System.out.println("Enter the radius of the circle: ");
        Double r=sc.nextDouble();
        PrintCircumference(r);
        }
    }
}
