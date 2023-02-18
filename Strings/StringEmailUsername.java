package JAVA.Tutorial.Strings;

import java.util.Scanner;

public class StringEmailUsername {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the email id:");
            String email=sc.nextLine();
            String username="";
            for(int i=0;i<=email.length();i++){
                if(email.charAt(i)=='@'){
                    break;
                }else{
                    username+=email.charAt(i);
                }
            }
            System.out.println("Usernname is: "+username);
        }
    }
}
