package JAVA.Tutorial.LoopANDIfElse;

import java.util.*;

public class buttonswitch {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int button=sc.nextInt();

            switch(button){
                case 1:
                {
                    System.out.println("hello");
                break;
                }
                 case 2:
                {
                    System.out.println("Namaste!");
                    break;
                }
                case 3:
                {
                    System.out.println("Bonjour!!!");
                    break;
                }
                default:
                {
                    System.out.println("Invalid Button");
                }

            }
        }
    }
    
}
