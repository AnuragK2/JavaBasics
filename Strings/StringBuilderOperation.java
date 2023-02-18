package JAVA.Tutorial.Strings;

import java.util.Scanner;

public class StringBuilderOperation {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb=new StringBuilder("");
            System.out.println("Enter the string: ");
            sb.append(sc.nextLine());  //input
            System.out.println(sb);   //display

            //char at index
            System.out.println(sb.charAt(3));

            //set char at index
            sb.setCharAt(0, 'S');
            System.out.println(sb);

            //delete
            sb.delete(0, 1);
            System.out.println(sb);

            //insert
            sb.insert(0, 'R');
            System.out.println(sb);

            //length
            System.out.println(sb.length());
        }
    }
}
