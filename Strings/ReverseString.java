package JAVA.Tutorial.Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb=new StringBuilder(" ");
            System.out.println("The string is: ");
            sb.append(sc.nextLine());
            System.out.println(sb);
            for(int i=0;i<sb.length()/2;i++){
                int front=i;
                int back=sb.length()-1-i;
                char frontChar=sb.charAt(front);
                char backChar=sb.charAt(back);
                sb.setCharAt(front, backChar);
                sb.setCharAt(back, frontChar);
            }
            System.out.println(sb);
        }
    }
}
