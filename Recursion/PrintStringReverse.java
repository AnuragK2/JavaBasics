package JAVA.Tutorial.Recursion;

import java.util.Scanner;

public class PrintStringReverse {
    public static void StringRev(StringBuilder str,int Index){
        if(Index==0){
            System.out.print(str.charAt(Index));
            return;
        }
        System.out.print(str.charAt(Index));
        StringRev(str, Index-1);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder str= new StringBuilder(" ");
            System.out.print("Enter the string: ");
            str.append(sc.nextLine());
            StringRev(str, str.length()-1);
        }
    }
}
