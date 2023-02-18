

import java.util.Scanner;

public class ArrayStringLength {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int size=sc.nextInt();
            String arr[]=new String[size];
            int totlength=0;
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.next();
                totlength+=arr[i].length();
            }
            System.out.println(totlength);
        }
    }
}
