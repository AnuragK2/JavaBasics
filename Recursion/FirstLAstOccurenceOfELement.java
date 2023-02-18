package JAVA.Tutorial.Recursion;

import java.util.Scanner;

public class FirstLAstOccurenceOfELement {
    public static int First=-1;
    public static int Last=-1;
    public static void PrintFirstLastOccurence(StringBuilder str,int index,char element){
        if(index==str.length()){
            System.out.print("This is the first occurence of element: \n"+First);
            System.out.println("This is the last occurence of element: "+Last);
            return;
        }
        char CurrentChar=str.charAt(index);
        if(CurrentChar==element){
            if(First==-1){
                First=index;
            }else{
                Last=index;
            }
        }
        PrintFirstLastOccurence(str, index+1, element);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb=new StringBuilder("");
            System.out.println("Enter the string: ");
            sb.append(sc.nextLine());
            PrintFirstLastOccurence(sb, 0, 'a');
        }
    }
}
