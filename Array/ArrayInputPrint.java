

import java.util.Scanner;

public class ArrayInputPrint {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int size=sc.nextInt();
            int arrInpr[]=new int[size];
            for(int i=0;i<size;i++){
                arrInpr[i]=sc.nextInt();
            }
            for(int i=0;i<size;i++){
                System.out.print(arrInpr[i]+" ");
            }
        }
    }
}
