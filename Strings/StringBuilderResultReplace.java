package JAVA.Tutorial.Strings;

import java.util.Scanner;

public class StringBuilderResultReplace {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb=new StringBuilder("");
            System.out.println("Enter the String:");
            sb.append(sc.nextLine());
            System.out.println(sb);
            String result="";
            for(int i=0;i<sb.length();i++){
                if(sb.charAt(i)=='e'){
                    result+='i';
                }else{
                    result+=sb.charAt(i);
                }
            }
            System.out.println("The String result is changed to: "+result);
        }
    }
}
