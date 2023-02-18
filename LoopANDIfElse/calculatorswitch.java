package JAVA.Tutorial.LoopANDIfElse;
 
import java.util.*;

public class calculatorswitch {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n Enter the value of 1st number:");
            int a=sc.nextInt();
            System.out.println("\n Enter the value of 2nd number:");
            int b=sc.nextInt();
            System.out.println("Select operation");
      System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: Remainder-r:");
      char ch = sc.next().charAt(0);
      switch(ch) {
         case 'a' :
         System.out.println("Sum of the given two numbers: "+(a+b));
         break;
         case 's' :
         System.out.println("Difference between the two numbers: "+(a-b));
         break;
         case 'm' :
         System.out.println("Product of the two numbers: "+(a*b));
         break;
         case 'd' :
         System.out.println("Result of the division: "+(a/b));
         break;
         case 'r' :
         System.out.println("Remainder of the division is:"+(a%b));
         break;
         default :
         System.out.println("Invalid grade");
      }
   }
}
}
