

import java.util.Scanner;

public class ArrayInputPrintName {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int size=sc.nextInt();
            String arrInPrName[]=new String[size];
            for(int i=0;i<size;i++){
                arrInPrName[i]=sc.next();
            }
            for(int i=0;i<arrInPrName.length;i++){
                System.out.print("name" + (i+1) + "is:" +arrInPrName[i]);
            }
        }
    }
}
