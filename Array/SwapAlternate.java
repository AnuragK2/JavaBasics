

import java.util.Scanner;

public class SwapAlternate {
    public static void Swap(int arr[], int size){
        for(int i=0;i<arr.length;i+=2){
            if(i+1<size){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
public static void PrintArray(int arr[],int size){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
    }
}

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:");
            int size=sc.nextInt();
            int even[]=new int[size];
            System.out.println("Enter the array elements for even:");
            for(int i=0;i<even.length;i++){
                even[i]=sc.nextInt();
                System.out.print(even[i]+" ");
                System.out.println();
            }
            Swap(even, size);
            PrintArray(even, size);
            /*int odd[]=new int[size];
            for(int i=0;i<odd.length;i++){
                odd[i]=sc.nextInt();
                System.out.println(odd[i]);
            }
            Swap(odd, size);
            PrintArray(odd, size);*/
        }
    }
}
