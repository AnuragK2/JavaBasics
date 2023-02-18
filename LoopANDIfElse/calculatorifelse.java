package JAVA.Tutorial.LoopANDIfElse;

import java.util.*;

public class calculatorifelse {

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=sc.nextInt();
        int ch=sc.next().charAt(0);
         if(ch=='+')
         {
             s=a+b;
             System.out.println("\n The sum of a and b is" +s);
         }
         else
         if(ch=='-')
         {
             s=a-b;
             System.out.println("\n The difference of a and b is" +s);
         }
         else
         if(ch=='*')
         {
             s=a*b;
             System.out.println("\n The product of a and b is" +s);
         }
         else
         if(ch=='/')
         {
             s=a/b;
             System.out.println("\n The quotient of a and b is" +s);
         }
         else if(ch=='%')
         {
             s=a%b;
             System.out.println("\n The remainder of a and b is" +s);
         }
         else
         {
             System.out.println("\n Invalid Character");
         }
        }
    }
}



        