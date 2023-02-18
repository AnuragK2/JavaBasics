

import java.util.Scanner;

public class ArrayXPosition {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int size=sc.nextInt();
            int Xposition[]=new int[size];
            for(int i=0;i<=size;i++){
                Xposition[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            for(int i=0;i<size;i++){
                if(Xposition[i]==x){
                    System.out.println("x found at index:"+i);
                }
            }
        }
    }
}
