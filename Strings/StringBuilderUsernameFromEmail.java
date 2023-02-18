package JAVA.Tutorial.Strings;

import java.util.Scanner;

public class StringBuilderUsernameFromEmail {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb=new StringBuilder("");
            System.out.println("Enter the Email id: ");
            sb.append(sc.nextLine());
            String username="";
            for(int i=0;i<sb.length();i++){
                if(sb.charAt(i)=='@'){
                    break;
                }
                else{
                    username+=sb.charAt(i);
                }
            }
            System.out.println("The username is: "+username);
        }
    }
}
