package JAVA.Tutorial.LoopANDIfElse;

import java.util.*;

public class condition {
    public static void main(String[] args)
{
    try (Scanner sc = new Scanner(System.in)) {
        int age=sc.nextInt();

        if(age>18)
        {
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }
    }

}
}
